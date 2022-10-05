package Stack;

import java.util.ArrayDeque;

public class MaxAreaInHistogram {
    static int[] previousSmaller(int[] arr)
    {
        int[] ans= new int[arr.length];
        ArrayDeque<Integer>stack= new ArrayDeque<>();

        for(int i=0;i<arr.length;i++)
        {
            int curr=arr[i];
            while(!stack.isEmpty()&&arr[stack.peek()]>=curr)
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                ans[i]=-1;
            }
            else
            {
                ans[i]=stack.peek();
            }

            stack.push(i);
        }

        return ans;
    }

    static int[] nextSmaller(int[] arr)
    {
        int[] ans= new int[arr.length];
        ArrayDeque<Integer>stack= new ArrayDeque<>();

        for(int i=arr.length-1;i>=0;i--)
        {
            int curr=arr[i];
            while(!stack.isEmpty()&&arr[stack.peek()]>=curr)
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                ans[i]=arr.length;
            }
            else
            {
                ans[i]=stack.peek();
            }

            stack.push(i);
        }

        return ans;
    }

    static int findMaxAreaInHistogram(int[] arr)
    {
        int[] ns= nextSmaller(arr);
        int[] ps= previousSmaller(arr);
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int width=ns[i]-ps[i]-1;
            int currArea= width*arr[i];
            max= Math.max(max, currArea);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr={4,3,9,2,5,1,8,3};
        
        System.out.println(findMaxAreaInHistogram(arr));
    }
}
