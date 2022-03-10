package Sorting;


public class CloserToSort {
    public static void main (String[] args) {
        int arr[]={3,2,10,4,40};
        int n=arr.length;
        int x=2;
		System.out.println(closer(arr, n, x));
		}
	

    static long closer(int arr[], int n, long x)
    {
    
        int l=0;int r=n-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == x)
                return mid;
            else if(mid-1>=0 && arr[mid-1]==x )
                return mid-1;
            else if(mid+1<=n-1 && arr[mid+1]==x)
                return mid+1;
            else if(arr[mid]>x)
                r = mid-1;
            else
                l = mid+1;
        }
        return -1;
        
    }
    
    
}
