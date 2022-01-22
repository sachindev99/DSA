package Sorting;

//Sort an array of 0s 1s 2s
//Dutch national flag algo
public class SortThreeTypeArray
{
    public static void main(String[] args) {
        int[]arr={0,1,0,2,1,2};
        sort(arr);

        for (int i : arr) {
            System.out.print(i+" ");
            
        }
    }

    static void sort(int[]arr)
    {
        int low=0;
        int high=arr.length-1;
        int mid=0;

        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
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