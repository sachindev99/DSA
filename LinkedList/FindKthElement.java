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

    // this is the another approach to find the data of kth node from end
    public static void twoPointerApproarch(Node head, int k)
    {
        // create two nodes pointing to the head
        Node main_ptr=head;
        Node ref_ptr=head;

        // Move ref_ptr to the k-th node from beginning
        for(int i=0;i<k;i++)
        {
            ref_ptr= ref_ptr.next;
        }
        //Now, move ref_ptr and main_ptr one node
        //at a time untill ref_ptr reaches the last node

        while(ref_ptr!=null)
        {
            main_ptr=main_ptr.next;
            ref_ptr= ref_ptr.next;
        }

        // The main_ptr is now at the kth node from end
        //print the data of main_ptr
        System.out.println(main_ptr.data);


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

       //findLength(head, 4);
       twoPointerApproarch(head, 5);
    }
}
