package Sorting;
public class QuickSort
{
    public static void main(String[] args) {
        int[] arr={3,2,4,2,5};
        quickSort(arr, 0, arr.length-1);

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
   static int partition(int[] arr,int low,int high)
   {
       int pivot=arr[low];
       int i=low;
       int j=high;

       while(i<j)
       {
           while(arr[i]<=pivot&&i<j)
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

       int temp=arr[low];
       arr[low]=arr[j];
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

