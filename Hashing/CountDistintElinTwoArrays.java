package Hashing;

public class CountDistintElinTwoArrays {
    public static void main(String[] args) {
        int[] a={10,15,20,5,30};
        int[] b={30,5,30,80};
        int n=a.length;
        int m=b.length;
        findFreq(a, b, n, m);
    }

    static void findFreq(int[] a,int[] b, int n, int m)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            boolean isVisited=false;
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                {
                    isVisited=true;
                    break;
                }
            }

            if(isVisited)
            {
                continue;
            }
            
            for(int j=0;j<m;j++)
            {
                if(a[i]==b[j])
                {
                    count++;
                    break;
                }
               
            }
   
        }
        System.out.println(count);
    }
}
