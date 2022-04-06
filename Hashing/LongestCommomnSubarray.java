package Hashing;

import java.util.HashMap;


public class LongestCommomnSubarray {
    public static void main(String[] args) {
        int[] arr1={0,1,0,0,0,0};
        int[] arr2={1,0,1,0,0,1};
        System.out.println(computeLongestSubarray(arr1,arr2,arr1.length));
    }

    private static int computeLongestSubarray(int[] arr1, int[] arr2, int n) {
        int[] temp=new int[n];

        for(int i=0;i<n;i++)
        {
            temp[i]=arr1[i]-arr2[i];
        }
        HashMap<Integer,Integer> hs = new HashMap<>();
        int prefix=0;
        int res=0;
        for(int i=0;i<n;i++)
        {
            prefix+=temp[i];
            if(prefix==0)
            {
                res=i+1;
            }

            if(hs.containsKey(prefix))
            {
                res=Math.max(res,i-hs.get(prefix));
            }

            if(hs.containsKey(prefix)==false)
            {
                hs.put(prefix,i);
            }

            

        }
        return res;
    }
}
