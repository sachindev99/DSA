package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFreqBetterSol {
    public static void main(String[] args) {
        int[] arr={50,50,10,40,10};
        int n=arr.length;
        countFreq(arr, n);
    }

    static void countFreq(int[] arr, int n)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        //use the default value if no value is mapped with the specified key
        //we added 1 because we have to increment the count
        
        for(int i:arr)
        {
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        System.out.println(hm.get(50));

        for(Map.Entry<Integer,Integer> e: hm.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
    
}
