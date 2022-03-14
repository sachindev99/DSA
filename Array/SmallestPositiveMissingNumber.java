package Array;


public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        int[] arr={0,-10,1,3,-20};
        int n=arr.length;
        System.out.println(missingNumber(arr, n));
    }

    static int missingNumber(int arr[], int n)
    {
       // step 1: Replace all non-positive number
       
       for(int i=0;i<n;i++)
       {
           if(arr[i]<=0)
           {
               arr[i]=n+2;
           }
       }
       
       //step 2: for every valid element make its bucket negative
       
       for(int i=0;i<n;i++)
       {
           int element=Math.abs(arr[i]);
           
           if(element>0&&element<=n&&arr[element-1]>0)
           {
               arr[element-1]=-arr[element-1];
           }
       }
       
       // step 3: iterate and return the smallest positive number
       
       for(int i=0;i<n;i++)
       {
           if(arr[i]>0)
           {
               return i+1;
           }
       }
       
       return n+1;
    }


    
}
