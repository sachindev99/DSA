package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={10,5,30,15,7};
        int n = arr.length;
        int low=0;int high=n-1;
        
        mergeSort(arr, low, high);

        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }

    static void mergeSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {
        // low=0;
        // high=arr.length-1;
        // mid=(low+high)/2;
        int i=low;
        int j= mid+1;
        int k=low;
       // int temp[]= new int[arr.length];

        while(i<=mid&&j<=high)
        {
            if(arr[j]<=arr[i])
            {
                int temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                k++;
                j++;
            }

            else
            {
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
                i++;
                k++;
            }
        }

        // while(i<=mid)
        // {
        //     int temp=arr[k];
        //     arr[k]=arr[i];
        //     arr[i]=temp;
        //     i++;
        //     k++;
        // }
        // while(j<=high)
        // {
        //     int temp=arr[k];
        //     arr[k]=arr[j];
        //     arr[j]=temp;
        //     j++;
        //     k++;
        // }
        

    }
    
}
