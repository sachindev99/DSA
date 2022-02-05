package Sorting;

public class BucketSort
{
    public static void main(String[] args) {
        int[]arr ={30,40,10,80,5,12,70};
        int n=arr.length;
        int max=findMax(arr, n);
        bucketSort(arr, max, n);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static int findMax(int[] arr,int n)
    {
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            max=Math.max(arr[i], max);
        }
        return max;
    }

    static void bucketSort(int[] arr,int max,int n)
    {
        int[] bucket= new int[max+1];

        for(int i=0;i<max+1;i++)
        {
            bucket[i]=0;
        }

        for(int i=0;i<n;i++)
        {
            bucket[arr[i]]=bucket[arr[i]]+1;
        }

        //bucket[arr[0]]=bucket[arr[0]]+1
        //bucket[3]=bucket[3]+1;
        //bucket[3]=0+1=1
        //{0,0,0,1,0,0}

        int i=0;
        int j=0;
        while(i<max+1)
        {
            if(bucket[i]>0)
            {
                arr[j]=i;
                j++;
                bucket[i]--;
            }

            else
            {
                i++;
            }
        }
    }
}