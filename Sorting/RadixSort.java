package Sorting;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr={15,1,321,10,802,2,123,90,109,11};
        int n=arr.length;
        int maxEl= findMax(arr, n);
        int maxLoopCount=findMaxCount(maxEl);
        radixSort(arr, n, maxLoopCount);
        
        
    }
    static int findMax(int[] arr,int n)
    {
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            max=Math.max(max, arr[i]);
        }
        return max;
    }
    static int findMaxCount(int maxEl)
    {
        int count=0;
        while(maxEl>0)
        {
            maxEl=maxEl/10;
            count++;
        }
        return count;
    }

    static void radixSort(int[]arr,int n,int maxLoopCount)
    {
        int[] temp=new int[10];
        


    }
    
}
