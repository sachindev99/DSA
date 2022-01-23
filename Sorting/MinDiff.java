package Sorting;

//Naive Solution
public class MinDiff {
    public static void main(String[] args) {
        int[] arr={5,3,8};
        int n=arr.length;
        System.out.println(getMinDiff(arr, n));
    }

    static int getMinDiff(int[]arr,int n)
    {
        int res=Integer.MAX_VALUE;
        for (int i = 0; i < n-1; i++) 
        {
            for (int j = i+1; j < n; j++)
            {
                res=Math.min(res,Math.abs(arr[j]-arr[i]));
            }
            
        }
        return res;
    }
}
