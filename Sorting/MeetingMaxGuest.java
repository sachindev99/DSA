package Sorting;

import java.util.Arrays;

public class MeetingMaxGuest {
    public static void main(String[] args) {
        // arrival array
        int[] arr={600,700,900};
        // departure array
        int[] dep={1000,800,730};
        int n= arr.length;

        System.out.println(maxGuest(arr, dep, n));

    }

    static int maxGuest(int[] arr, int[] dep,int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0;
        int j=0;
        int res=1;
        int curr=0;

        while(i<n&&j<n)
        {
            if(arr[i]<=dep[j])
            {
                curr++;
                i++;
            }

            else
            {
                curr--;
                j++;
            }

            res=Math.max(res, curr);

        }

        return res;
    }
}
