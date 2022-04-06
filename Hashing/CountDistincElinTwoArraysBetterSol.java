package Hashing;

import java.util.HashSet;

public class CountDistincElinTwoArraysBetterSol {
    public static void main(String[] args) {
        int[] a={10,20,10,30};
        int[] b={20,10,10,40};
        int n=a.length;
        int m=b.length;
        findFreq(a, b, n, m);
    }

    private static void findFreq(int[] a, int[] b, int n, int m) {
        HashSet<Integer> hs= new HashSet<>();
        int count=0;

        for(int i=0;i<n;i++)
        {
            hs.add(a[i]);
        }

        for(int i=0;i<m;i++)
        {
            if(hs.contains(b[i]))
            {
                count++;
                hs.remove(b[i]);
            }
          
        }

        if(count>1)
        {
            System.out.println(count);
        }

     

        // System.out.println((n+m)-hs.size());
        // char ch='v';
        // String st="geeks";

        // if(ch>='a'&&ch<='z')
        // {
        //     System.out.println("lower case");
        // }

        // else
        // {
        //     System.out.println("Upper case");
        // }

        // System.out.println(st.toUpperCase());
        // //System.out.println("geeks");

    }
}
