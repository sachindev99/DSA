package Stack;

import java.util.ArrayDeque;

public class StackWithGetMin {
    ArrayDeque<Integer> ms = new ArrayDeque<>();
    ArrayDeque<Integer> as = new ArrayDeque<>();
    
    void push(int x)
    {
        if(ms.isEmpty()&&as.isEmpty())
        {
            ms.push(x);
            as.push(x);
            return;
        }

        ms.push(x);

        if(as.peek()>=ms.peek())
        {
            as.push(x);
        }
    } 

    void pop()
    {
        if(as.peek()==ms.peek())
        {
            as.pop();
        }

        ms.pop();
    }

    int getMin()
    {
        return as.peek();
    }

    public static void main(String[] args) {
        StackWithGetMin myStack = new StackWithGetMin();
        myStack.push(4);
        myStack.push(5);
        myStack.push(2);
        myStack.push(6);
        myStack.pop();

        System.out.println("Min element from stack: "+ myStack.getMin());
    }
}
