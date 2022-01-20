package Sorting;

import java.util.Arrays;

public class ChocolateDist
{
    public static void main(String[] args) {
        int m=5;
        int[] arr={7,3,2,4,9,12,56};
        Arrays.sort(arr);
        int n=arr.length-1;
        System.out.println(minDiff(arr, n, m));
        
    }

    static int minDiff(int[] arr,int n, int m)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++)
        {
             min=Math.min(arr[i+m-1]-arr[i],min);
        }

        return min;
    }
}
