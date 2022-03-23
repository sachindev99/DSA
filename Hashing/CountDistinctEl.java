package Hashing;

import java.util.HashSet;

public class CountDistinctEl {
    public static void main(String[] args) {
        int[] arr={10,10,10};
        HashSet<Integer>hs = new HashSet<Integer>();

        for(int i:arr)
        {
            hs.add(i);
        }

        System.out.println(hs.size());
    }
    
}
