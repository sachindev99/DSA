package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
    }
}
public class FindMiddle {
    static int findMiddleLL(Node head)
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {
        Node n1= new Node(10);
        Node n2= new Node(20);
        Node n3= new Node(30);
        Node n4= new Node(40);
        Node n5= new Node(50);
        Node n6= new Node(60);
        
        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n6.next=null;
        System.out.println(findMiddleLL(head));
    }
}
