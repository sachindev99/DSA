package Sorting;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
       int  arr[]={1,1,3,3,3};
       int brr[] ={1,1,1,1,3,5,7};
       ArrayList<Integer> temp=intersectionFun(arr, brr);

       for (int a : temp) {
           System.out.print(a+" ");
       }
    }

    static ArrayList<Integer> intersectionFun(int[] arr,int[] brr)
    {
        ArrayList<Integer> al= new ArrayList<Integer>();
        int i=1;
        int j=0;
        int n=arr.length;
        int m=brr.length;

        if(arr[0]==brr[0])
        {
            al.add(arr[0]);
        }   
        while(i<n&&j<m)
        {
            if(arr[i]!=arr[i-1])
            {
                if(arr[i]==brr[j])
                {
                    al.add(arr[i]);
                    i++;
                    j++;
                }

                else if(arr[i]<brr[j])
                {
                    i++;
                }

                else 
                {
                    j++;
                }
            }

            else{
                i++;
            }
        }

        return al;
    }
}
