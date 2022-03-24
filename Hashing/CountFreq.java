package Hashing;

import java.util.Arrays;

public class CountFreq {
    public static void main(String[] args) {
        int[] arr={10,12,10,15,10,20,12,12};
        int n=arr.length;
        Arrays.sort(arr);
        countFrequecyOfRepeatedEls(arr, n);
    }

    static void countFrequecyOfRepeatedEls(int[] arr, int n)
    {
        int count=1;

        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
            }

            else
            {
                System.out.println(count);
                count=1;
            }
        }
        if(arr[n-1]!=arr[n-2])
        {
            System.out.println(count);
        }
    }
    
}
