package Array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,3,4};
        removeDuplEls(arr,arr.length);
        for(int i:arr)
        {
           // System.out.print(i+" ");
        }
    }

    private static void removeDuplEls(int[] arr, int n) {
        boolean [] temp= new boolean[n];
        int res[] = new int[n];
        
        for(int i=0;i<temp.length;i++)
        {
            temp[i]=true;
        }

        for(int i=0;i<n;i++)
        {
            if(temp[i]==true)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        temp[j]=false;
                    }
                }
            }
        }
       
      
       

        for(int i=0;i<n;i++)
        {
            if(temp[i]==true)
            {
               res[i]=arr[i]; 
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(res[i]+" ");
        }


    }
    
}
