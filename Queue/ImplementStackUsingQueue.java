package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    Queue<Integer> q1=new LinkedList<Integer>(); 
    Queue<Integer> q2=new LinkedList<Integer>(); 

    int top(){
        if(!q1.isEmpty()){
        return q1.peek();
        }

        else{
            return -1;
        }
    }

    int pop(){
        if(!q1.isEmpty()){
            return q1.remove();
        }
        return -1;
    }

    void push(int data){
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }

        q1.add(data);

        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue imp = new ImplementStackUsingQueue();
        imp.push(10);
        imp.push(15);
        imp.push(20);
        imp.push(25);
        System.out.println(imp.pop());
        imp.push(30);
        System.out.println(imp.pop());
    }

}
