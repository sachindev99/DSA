package Sorting;

public class KthSmallestElement 
{
    public static void main(String[] args) {
        int[] arr={10,5,30,12};
        findElement(arr, 0, arr.length-1);
        int k=3;
        System.out.println(arr[k-1]);
    }

    static void findElement(int []arr,int low,int high)
    {
        if(low<high)
        {
            int pivot=partition(arr, low, high);
            findElement(arr, low, pivot-1);
            findElement(arr, pivot+1, high);
        }
    }

    static int partition(int[] arr, int low,int high)
    {
        int i=low;
        int j=high;
        int key=arr[low];

        while(i<j)
        {
            while(arr[i]<=key&&i<arr.length-1)
            {
                i++;
            }
            while(arr[j]>key)
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
