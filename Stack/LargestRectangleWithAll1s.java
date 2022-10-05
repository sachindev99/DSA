package Stack;

import java.util.ArrayDeque;

public class LargestRectangleWithAll1s
{
    static int[] previousSmaller(int[] arr)
    {
        ArrayDeque<Integer> stack= new ArrayDeque<>();
        int[] res= new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            while(!stack.isEmpty()&&arr[stack.peek()]>=arr[i])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                res[i]=-1;
            }

            else
            {
                res[i]=stack.peek();
            }

            stack.push(i);
        }

        return res;
    }

    static int[] nextSmaller(int[] arr)
    {
        ArrayDeque<Integer> stack= new ArrayDeque<>();
        int[] res= new int[arr.length];

        for(int i=arr.length-1;i>=0;i--)
        {
            while(!stack.isEmpty()&&arr[stack.peek()]>=arr[i])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                res[i]=arr.length;
            }

            else
            {
                res[i]=stack.peek();
            }

            stack.push(i);
        }

        return res;
    }


    static int maxAreaInHistogram(int[] arr)
    {
        int[] ns= nextSmaller(arr);
        int[] ps=previousSmaller(arr);

        int maxArea=-1;
        for(int i=0;i<arr.length;i++)
        {   
            int width= ns[i]-ps[i]-1;
            int area= arr[i]*width;
            maxArea=Math.max(maxArea, area);
        }

        return maxArea;
    }
    
    static int maxRectangle(int mat[][])
    {
        int b[] =mat[0];
        int res= maxAreaInHistogram(mat[0]);

        for(int i=1;i<mat.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(mat[i][j]==1)
                {
                    mat[i][j]+=mat[i-1][j];
                }
            }

            res= Math.max(res, maxAreaInHistogram(mat[i]));
        }

        return res;
    }
    public static void main(String[] args) {
        int[][] arr= {
                    { 0, 1, 1, 0 },
                    { 1, 1, 1, 1 }, 
                    { 1, 1, 1, 1 }, 
                    { 1, 1, 0, 0 },
    };
        int res= maxRectangle(arr);
        System.out.println(res);

   
    }

}