package Sorting;

// how to make worst time complexity(O(n2)) to best time complexity(O(nlogn)) when the array is sorted
public class QuickSortBestCase {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7};
        quickSort(arr, 0, arr.length-1);

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
   static int partition(int[] arr,int low,int high)
   {
       int pivot=arr[(low+high)/2];
       int i=low;
       int j=high;

       while(i<j)
       {
           while(arr[i]<=pivot)
           {
               i++;
           }

           while(arr[j]>pivot)
           {
               j--;
           }

           if(i<j)
           {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
           }
       }

       int temp=pivot;
       pivot=arr[j];
       arr[j]=temp;

       return j;
   }

   public static void quickSort(int[] arr,int low, int high)
   {
       if(low<high)
       {
            int pivot=partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
       }
   }
}
