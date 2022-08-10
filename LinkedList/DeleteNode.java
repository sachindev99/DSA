package LinkedList;

public class DeleteNode {
    public static void main(String[] args) {
        Node n1= new Node(10);
        Node n2= new Node(20);
        Node n3= new Node(30);
        Node n4= new Node(40);
        
        Node head= n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;
        printLL(head);
        System.out.println();
        head=deleteNode(3, head);
        printLL(head);


    }

    public static void printLL(Node head)
    {
        Node curr=head;

        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static Node deleteNode(int position,Node head)
    {
        if(head==null) return null;
        if(position==0)
        {
            head=head.next;
            return head;
        }
        Node curr=head;

        for(int i=0;i<position-1;i++)
        {
            curr=curr.next;
        }

        curr.next=curr.next.next;

        return head;
    }

    
}

class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
    }
}
