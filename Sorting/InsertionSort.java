package Sorting;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int n =arr.length;
        insertSort(arr, n);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void insertSort(int[] arr,int n)
    {
        for (int i = 1; i < n; i++) {
            //store the current element in a key variable
            int key=arr[i];
            int j=i-1;

            //shift element to the the right until there's an element smaller than key
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            //when you find an element smaller than key you insert the element to its right

            arr[j+1]=key;
        }
    }
    
}
