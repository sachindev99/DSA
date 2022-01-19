public class QuickSort
{
    public static void main(String[] args) {
        int[] arr={5,3,8,4,2,7,1,10};
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
           while(arr[i]<=pivot&&i<=j)
           {
               i++;
           }

           while(arr[j]>pivot&&i<=j)
           {
               j--;
           }

           if(i<j)
           {
               swap(arr,arr[i],arr[j]);
           }
       }

       swap(arr,arr[j],arr[low]);

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

private static void swap(int[] arr,int i, int j) 
{
    int temp=i;
    i=j;
    j=temp;
} 
}

