package Hashing;

import java.util.HashSet;

public class CountDistincElinTwoArraysBetterSol {
    public static void main(String[] args) {
        int[] a={15, 17, 27, 27, 28, 15};
        int[] b={16, 17, 28, 17, 31, 17};
        int n=a.length;
        int m=b.length;
        findFreq(a, b, n, m);
    }

    private static void findFreq(int[] a, int[] b, int n, int m) {
        HashSet<Integer> hs= new HashSet<>();

        for(int i=0;i<n;i++)
        {
            hs.add(a[i]);
        }

        for(int i=0;i<m;i++)
        {
            hs.add(b[i]);
        }

        System.out.println((n+m)-hs.size());
        char ch='v';
        String st="geeks";

        if(ch>='a'&&ch<='z')
        {
            System.out.println("lower case");
        }

        else
        {
            System.out.println("Upper case");
        }

        System.out.println(st.toUpperCase());
        //System.out.println("geeks");

    }
}
