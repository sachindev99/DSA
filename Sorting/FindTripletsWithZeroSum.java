package Sorting;

import java.util.Arrays;

public class FindTripletsWithZeroSum {
    public static void main(String[] args) {
        int[] arr={-65,-21,5,60,8,93};
        System.out.println(findTriplets(arr, arr.length));

    }
    public static boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++)
        {
           int j=i+1;
           int k=n-1;
           
           while(j<k)
           {
                if(arr[i]+arr[j]+arr[k]==0)
                {
                    return true;
                }
           
                else if(arr[i]+arr[j]+arr[k]>0)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }
        return false;
    }
}
