package BinarySearch;

public class searchInInfiniteSortedArray {

static int findIndex(int[] arr, int key)
{
    if(arr.length==0) return -1;
    if(arr[0]==key) return 0;
    int index=1;

    while(arr[index]<=key)
    {
        index=index*2;
    }

    return binarySearch(arr, key, index/2, index);


}

static int binarySearch(int [] arr, int key,int low, int high)
{ 
    while(low<=high)
    {
        int mid=(low+high)/2;
        if(arr[mid]==key)
        {
            return mid;
        }

        if(key>arr[mid])
        {
            low=mid+1;
        }

        else
        {
            high=mid-1;
        }
    }

    return -1;
}
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,8,9,12,13,15,16,18,19,21,29,31,34,35,36,37,38,39,40};
        int key=29;
        System.out.println(findIndex(arr, key));
    }
}
