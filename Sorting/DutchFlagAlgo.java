package Sorting;

// sort the array with three types
public class DutchFlagAlgo {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0};
        sort(arr, arr.length);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    static void sort(int[] arr,int n)
    {
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }

            else if(arr[mid]==1)
            {
                mid++;
            }

            else
            {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }

        }
    }

    
}
