package Sorting;

public class SegregrateEvenOdd {
    public static void main(String[] args) {
        int[] arr={15,14,13,12};
        segregation(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

    public static void segregation(int[] arr)
    {
        int low=0;
        int high=arr.length-1;

        while(low<high)
        {
            while(arr[low]%2==0&&low<high)
            {
                low++;
            }

            while(arr[high]%2!=0&&low<high)
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
