package Sorting;

public class MinDiffBetterSol {
    public static void main(String[] args) {
        int [] arr={10,8,1,4};
        quickSortSol(arr, 0, arr.length-1);
        
        int res=Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            res=Math.min(res,Math.abs(arr[i]-arr[i-1]));
        }

        System.out.println(res);
    }

    static void quickSortSol(int[] arr,int low, int high)
    {
        if(low<high)
        {
            int pivot= partition(arr, low, high);
            quickSortSol(arr, low, pivot-1);
            quickSortSol(arr, pivot+1, high);
        }
    }

    static int partition(int[] arr,int low, int high)
    {
        int i=low;
        int j=high;
        int pivot=arr[low];

        while(i<j)
        {
            while(arr[i]<=pivot &&i<arr.length-1)
            {
                i++;
            }

            while(arr[j]>pivot&&i<arr.length-1)
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
