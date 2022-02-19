package Sorting;

public class SegregateBinaryArray {
    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,0,0};
        segreagation(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    static void segreagation(int[] arr,int low,int high)
    {
        while(low<high)
        {
            while(arr[low]==0&&low<high)
            {
                low++;
            }

            while(arr[high]==1&&low<high)
            {
                high--;
            }

            if(low<high)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
            }
        }

    }
    
}
