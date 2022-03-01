package Sorting;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr={2,2,2,4,5};
        int[] brr={1,1,2,3,4};
        int n=arr.length;
        int m =brr.length;
        unionOfArrays(arr, brr, n, m);
    }

    static void unionOfArrays(int[] arr,int[] brr,int n,int m)
    {
        int i=0;
        int j=0;

        while(i<n&&j<m)
        {
            if(i>0&&arr[i]==arr[i-1])
            {
                i++;
                continue;
            }

            if(j>0&&brr[j]==brr[j-1])
            {
                j++;
                continue;
            }

            if(arr[i]<brr[j])
            {
                System.out.print(arr[i]+" ");
                i++;
            }

            else if(arr[i]==brr[j])
            {
                System.out.print(arr[i]+" ");
                i++;
                j++;
            }

            else
            {
                System.out.print(brr[j]+" ");
                j++;
            }
        
        }

        while(i<n)
        {
            if(i>0&&arr[i]!=arr[i-1])
            {
                System.out.print(arr[i]+" ");
                i++;
            }
            else
            {
                i++;
            }
        }

        while(j<m)
        {
            if(j>0&&brr[j]!=brr[j-1])
            {
                System.out.print(brr[j]+" ");
                j++;
            }
            else
            {
                j++;
            }
        }
    }
}
