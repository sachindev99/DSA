package Sorting;
// the idea is to find out the minimum element and put it at first position

public class SelectionSort 
{
    public static void main(String[] args) {
        int[] arr={5,2,8,1,6};
        selectionSort(arr);

        for(int x:arr)
        {
            System.out.print(x+" ");
        }

    }
    static void selectionSort(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int minIndex=i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }

}
