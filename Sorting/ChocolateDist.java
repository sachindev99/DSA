//Given an array of n integers where each value represents the number of chocolates in a packet. 
//Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 
//Each student gets one packet.
//The difference between the number of chocolates in the packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.
package Sorting;

import java.util.Arrays;

public class ChocolateDist
{
    public static void main(String[] args) {
        int m=3;
        int[] arr={7,3,2,4,9,12,56};
        Arrays.sort(arr);
        System.out.println(minDiff(arr, arr.length, m));
    }

    static int minDiff(int[] arr,int n, int m)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-m+1;i++)
        {
             min=Math.min(arr[i+m-1]-arr[i],min);

        }

        
        return min;
    }
}
