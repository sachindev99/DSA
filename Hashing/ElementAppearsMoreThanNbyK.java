package Hashing;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearsMoreThanNbyK {
    public static void main(String[] args) {
        int[] arr={30,10,20,20,20,30,10,30};
        int n=arr.length;
        int k=4;
        findElements(arr,n,k);
    }

    private static void findElements(int[] arr, int n,int k) {
        HashMap<Integer,Integer>hm= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            if(e.getValue()>n/k)
            {
                System.out.print(e.getKey()+" ");
            }
        }
    }  
}