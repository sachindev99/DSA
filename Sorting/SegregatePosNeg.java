// This is a naive solution
package Sorting;

public class SegregatePosNeg 
{
    public static void main(String[] args) {
        int[] arr={15,-3,-2,18};
        int n=arr.length;
        segreagation(arr, n);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
    static void segreagation(int[] arr,int n)
    {
        int temp[] = new int[n];
        int index=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                temp[index]=arr[i];
                index++;
            }
        }

        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                temp[index]=arr[i];
                index++;
            }
        }

        for(int i=0;i<n;i++)
        {
            arr[i]=temp[i];
        }
    }

}
