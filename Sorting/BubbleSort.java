package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={15,1,10,8,2,7};
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
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
