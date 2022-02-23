package Sorting;

import java.util.Arrays;

public class MergeIntervals implements Comparable<MergeIntervals> {
    int start,end;
    MergeIntervals(int start,int end)
    {
        this.start=start;
        this.end=end;
    }

    //Sorting the array based on the start value
    @Override
    public int compareTo(MergeIntervals m) {
       return this.start-m.start;
    }

    public static void main(String[] args) 
    {
        MergeIntervals arr[]= {new MergeIntervals(5, 10), new MergeIntervals(3, 15), new MergeIntervals(18, 30), new MergeIntervals(2, 7)};
        int n =arr.length;
        mergeIntIn(arr, n);
    }

    static void mergeIntIn(MergeIntervals[] arr,int n)
    {
        Arrays.sort(arr);
        int res=0;

        for(int i=1;i<n;i++)
        {
            if(arr[res].end>=arr[i].start)
            {
                arr[res].start=Math.min(arr[res].start,arr[i].start);
                arr[res].end=Math.max(arr[res].end,arr[i].end);
            }

            else
            {
                res++;
                arr[res].start=arr[i].start;
                arr[res].end=arr[i].end;
            }
        }

        for (int i = 0; i<=res; i++)
        {
           System.out.print("["+arr[i].start+", "+arr[i].end+"]"); 
        }
    }

}
