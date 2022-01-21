package Sorting;
// Segereation of Postive and Negative number
public class SegregationBetterSol {
    public static void main(String[] args) {
        int[] arr={15,-3,-2,18};
        quickSort(arr, 0, arr.length-1);
    
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int pivot=partition(arr, 0, arr.length-1);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);

        }
    }


    static int partition(int[] arr, int low,int high)
    {
        int i=low; int j=high; int pivot=arr[low];

        while(i<j)
        {
            while(arr[i]<=pivot&&i<arr.length)
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
 
    
}
