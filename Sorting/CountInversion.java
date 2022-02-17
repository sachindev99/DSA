package Sorting;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr={2,4,1,3,5};
        int n=arr.length;

        System.out.println(count(arr, 0, n-1));
    }

    static int count(int[] arr,int low,int high)
    {
        int res=0;

        if(low<high)
        {
            int mid=(low+high)/2;
            res=res+count(arr,low,mid);
            res=res+count(arr, mid+1, high);
            res=res+countInv(arr,low,mid,high);
        }

        return res;
    }

     static int countInv(int[] arr, int low, int mid, int high) {
        int i=low;
        int j=mid+1;
        int k=low;
        int res=0;
        int[] temp= new int[arr.length];

        while(i<=mid&&j<=high)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
                k++;
            }

            else
            {
                temp[k]=arr[j];
                res=res+(mid+1-i);
               
                k++;
                j++;

            }
            
        }

        while(j<=high)
        {
            temp[k]=arr[j];
            k++;
            j++;
        }
   
        while(i<=mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }

        for (k = low; k<=high; k++) 
        {
            arr[k]=temp[k];
        }
        return res;

    }
    
}
