package Sorting;

//consider we have two subsorted array 10,20,40 and 20,30
//we need to have a complete sorted array 10,20,20,30,40
public class MergeFunction {
    
    public static void main(String[] args) {
        int[] arr={10,20,40,20,30};
        int n=arr.length;
        mergeFun(arr,n);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void mergeFun(int[] arr, int n) {
        int low=0;
        int high=n-1;
        int mid=(low+high)/2;
        int i=0;
        int j= mid+1;
        int k=0;
        int temp[]= new int[n];

        while(i<=mid&&j<=high)
        {
            if(arr[j]<=arr[i])
            {
                temp[k]=arr[j];
                k++;
                j++;
            }

            else
            {
                temp[k]=arr[i];
                i++;
                k++;
            }
        }

        while(i<=mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=high)
        {
            temp[k]=arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < temp.length; l++) {
            arr[l]=temp[l];
        }

    }
}
