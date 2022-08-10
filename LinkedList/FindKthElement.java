package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
    }
}
public class FindKthElement {

    public static void findLength(Node head, int k)
    {
    //find the length of the linked list
    Node curr=head;
    int len=0;

    while(curr!=null)
    {
        curr=curr.next;
        len++;
    }
    if(len<k)
    {
        return;
    }

    if(k==0)
    {
        return;
    }

    int position= len-k;

    Node temp=head;
    for(int i=0;i<position;i++)
    {
        temp=temp.next;
    }

    System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Node n1= new Node(10);
        Node n2= new Node(20);
        Node n3= new Node(30);
        Node n4= new Node(40);
        Node n5= new Node(50);

        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;

       findLength(head, 0);
    }
}
