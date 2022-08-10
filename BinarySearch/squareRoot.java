package BinarySearch;

public class squareRoot {
    static int findSqrt(int n)
    {
        int low=1;
        int high=n;
        int ans=1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            int midSqrt=mid*mid;
            if(midSqrt==n) return mid;

            if(midSqrt>n)
            {
                high=mid-1;
            }

            else
            {
                ans=mid;
                low=mid+1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int n=78;
        System.out.println(findSqrt(n));
    }
}
