package LinkedList;

public class ReverseALinkedList
{
    public static void main(String[] args) {
        Node n1= new Node(1);
        Node n2= new Node(2);
        Node n3= new Node(3);
        Node n4 = new Node(4);

        Node head= n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        Node newHead=reverseLinkedListIteratively(head);
        printLinkedList(newHead);
        // System.out.println();
        // Node newHead= reverseLinkedList(head);
        // printLinkedList(newHead);
        

    }

    static void printLinkedList(Node head)
    {
        Node curr=head;

        while(curr!=null)
        {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("null");
    }

    //recursively
    static Node reverseLinkedList(Node head)
    {
        if(head==null|| head.next==null)
        {
            return head;
        }

        Node newHead= reverseLinkedList(head.next);
        Node temp=head.next;
        temp.next=head;
        head.next=null;
        return newHead;
    }
    static Node reverseLinkedListIteratively(Node head)
    {
        Node curr=head;
        Node prev=null;

        while(curr!=null)
        {
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
    }
}