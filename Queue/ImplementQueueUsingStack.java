package Queue;

import java.util.Stack;

public class ImplementQueueUsingStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void push(int data){
        s1.push(data);
    }

    static int pop(){
        //pushing all the elements into s2
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }

        //FIFO 
        int ans = (int) s2.pop();

        //pushing back elements from s2 to s1
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }

        return ans;
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        push(40);
        push(50);
        System.out.println(pop());
        System.out.println(pop());
    
    }




}
