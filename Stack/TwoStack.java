package Stack;

public class TwoStack {
    int top1;
    int top2;
    int[] arr;

    TwoStack(int capacity)
    {
        arr= new int[capacity];
        top1=-1;
        top2=capacity;
    }

    void push1(int data) throws Exception
    {
        if(top1+1<top2)
        {
            top1++;
            arr[top1]=data;
        }

        else
        {
            throw new Exception("Stack1 array is full");
        }
    }

    void push2(int data) throws Exception
    {
        if(top2-1>top1)
        {
            top2--;
            arr[top2]=data;
        }
        else
        {
            throw new Exception("Stack2 array is full");
        }
    }

    int pop1() throws Exception
    {
        if(top1>-1)
        {
            int res=arr[top1];
            top1--;
            return res;
        }

        else
        {
            throw new Exception("Stack is empty");
        }
    }

    int pop2() throws Exception
    {
        if(top2<arr.length)
        {
            int res=arr[top2];
            top2++;
            return res;
        }

        else
        {
            throw new Exception("Stack is empty");
        }
    }
    public static void main(String[] args) throws Exception {
        TwoStack ts= new TwoStack(5);
        ts.push1(10);
        ts.push1(20);
        ts.push2(30);
        ts.push2(40);
        ts.push2(50);
      System.out.println(ts.pop1()); 
      System.out.println(ts.pop1());
      System.out.println(ts.pop2());
      System.out.println(ts.pop2());
      System.out.println(ts.pop2());
      System.out.println(ts.pop2());
     
    }
}
