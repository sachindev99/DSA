package Queue;

public class ImplementQueueUsingLL {

    private Node front, rear;
    
    void enqueue(int data)
    {
        Node newNode= new Node(data);

        if(isEmpty())
        {
            front=newNode;
            rear=newNode;
        }

        rear.next=newNode;
        rear=newNode;
        
    }

    int dequeue() throws Exception
    {
        if(!isEmpty())
        {
            int ans= front.data;
            front=front.next;
            return ans;
        }

        else
        {
            throw new Exception("Queue is Empty");
        }
    }

    int getFront() throws Exception
    {
        if(!isEmpty())
        {
            return front.data;
        }

        else
        {
            throw new Exception("Peek is null");
        }
    }

    boolean isEmpty()
    {
        return front==null;
    }

    public static void main(String[] args) throws Exception{
        ImplementQueueUsingLL imp= new ImplementQueueUsingLL();
        imp.enqueue(10);
        imp.enqueue(20);
        imp.enqueue(30);
        imp.enqueue(40);
        System.out.println(imp.getFront());
        System.out.println(imp.dequeue());
        System.out.println(imp.dequeue());
        System.out.println(imp.dequeue());
        System.out.println(imp.dequeue());
        
    }
}



class Node
{
    Node next;
    int data;

    public Node(int data)
    {
        this.data=data;
    }
}
