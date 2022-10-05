package LinkedList;

public class BubbleSort {
    public static void main(String[] args) {
        Node n1= new Node(40);
        Node n2= new Node(20);
        Node n3= new Node(60);
        Node n4= new Node(10);
        Node n5= new Node(50);
        Node n6= new Node(80);
        
        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=null;
        printLL(head);
        bubbleSort(head);
        printLL(head);
        
    }

    public static void bubbleSort(Node head)
    {
        Node curr=head;
        int counter=0;

        //finding the size of the linked list
        while(curr!=null)
        {
            curr=curr.next;
            counter++;
        }

        for(int i=0;i<counter;i++)
        {
            while(curr!=null&&curr.next!=null)
            {
                if(curr.next.data<curr.data)
                {
                    int temp=curr.data;
                    curr.data=curr.next.data;
                    curr.next.data=temp;
                    curr=curr.next;
                }

                else
                {
                    curr=curr.next;
                }
            }
            //pointing curr to the first node again   
            curr=head;
        }

    }

static void printLL(Node head)
{
    Node curr=head;
    while(curr!=null)
    {
        System.out.print(curr.data+"->");
        curr=curr.next;
    }
    System.out.print("null");
    System.out.println();
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