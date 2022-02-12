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
        int i=low;
        int j= mid+1;
        int k=low;
        int temp[]= new int[arr.length];
    
        while(i<=mid&&j<=high)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
                k++;
            }

            else
            {
                temp[k]=arr[j];
                k++;
                j++;
            }
        }

      
        while(j<=high)
        {
            temp[k]=arr[j];
            k++;
            j++;
        }
   
        while(i<=mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        

        for (k = low; k<=high; k++) 
        {
            arr[k]=temp[k];
        }

    }
    
}
