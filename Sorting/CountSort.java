package Sorting;

public class CountSort {
    public static void main(String[] args) {
        int[] arr={1,4,4,1,0,1};
        int n=arr.length;
        countSort(arr, n);

        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }
    public static int findMax(int[] arr,int n)
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max, arr[i]);
        }
        return max;
    }

    public static void countSort(int[] arr,int n)
    {
        int max=findMax(arr, n);
        //create a temp[] array of size max+1

        int[] temp=new int[max+1];
        
        //initialize it to zero

        for (int i = 0; i < temp.length; i++) 
        {
            temp[i]=0;
        }

        //increment the count of temp array elements based on the values of array element
        for (int i = 0; i < n; i++)
        {
            temp[arr[i]]=temp[arr[i]]+1;   //temp[arr[0]]+1-->temp[1]+1-->0+1=1 {0,1,0,0,0}
        }

        //temp[]={1,3,0,0,2}

        //now, copy the values to arr[] and decrement the count by 1 each time

        int i=0,j=0;
        while(i<temp.length)
        {
            if(temp[i]>0)
            {
                arr[j]=i;
                j++;
                temp[i]--;
            }
            else
            {
                i++;
            }
        }

    }
    
}
