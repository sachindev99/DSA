package Sorting;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr={20,40,50,10,30};
        int n=arr.length;
        implementation(arr, n);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    static void implementation(int[] arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int currItem=arr[i];
            int pos=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<currItem)
                {
                    pos++;
                }
            }

                int temp=currItem;
                currItem=arr[pos];
                arr[pos]=temp;
    
            while(pos!=i)
            {
                pos=i;
                for(int j=i+1;j<n;j++)
                {
                    if(arr[j]<currItem)
                    {
                        pos++;
                    }
                }
                temp=currItem;
                currItem=arr[pos];
                arr[pos]=temp;
            }
            
        }
    }
    
}


