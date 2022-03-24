package Hashing;

public class CountFreqAnotherSol {
    public static void main(String[] args) {
        int[] arr={10,12,10,15,10,20,12,12};
        int n=arr.length;
        countFreq(arr, n);
    }

    static void countFreq(int[] arr, int n)
    {
        
        for (int i = 0; i < arr.length; i++) {
            boolean isVisited=false;
            //check if seen before
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    isVisited=true;
                    break;
                }
            }
            //if seen, ignore
            if(isVisited==true)
            {
                continue;
            }
            //if not seen before count frequency
            int count=1;
            for (int j = i+1; j < arr.length; j++) 
            {
                if(arr[i]==arr[j])
                count++;
            }
            System.out.println(count);
        }
        
    
    }

        
}
