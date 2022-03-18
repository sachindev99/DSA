package Array;

public class FloorSqrt {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(findFloorSqrt(n));
    }

    public static int findFloorSqrt(int n)
    {
        int i=1;
        int count=1;
        while(i<=n)
        {
            i=i*i;
            i++;
            count++;
        }

        return count;
    }
    
}
