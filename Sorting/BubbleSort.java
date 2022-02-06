package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,1,2,3,4};
        int n=arr.length;
        bubbleSort(arr, n);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    static void bubbleSort(int[] arr, int n)
    {
        for(int i=0;i<n-1;i++)
        {
            boolean swapped= false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }

            if(swapped==false)
            {
                break;
            }
        }
    }
}
