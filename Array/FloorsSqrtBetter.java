package Array;

public class FloorsSqrtBetter {
    public static void main(String[] args) {
        int n=25;
        System.out.println(findFloorSqrt(n));

    }

    public static int findFloorSqrt(int n)
    {
        int low=1;
        int high=n-1;
        int mid=0;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(mid*mid==n)
            {
                return mid;
            }

            else if(mid*mid>n)
            {
                high=mid-1;
            }

            else
            {
                low=mid+1;
            }
        }

        return mid-1;
    }
}
