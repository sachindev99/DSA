package LinkedList;

public class InsertNode {
    
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

    public static Node insertLL(int data, int position, Node head)
    {
        //create a new node which you want to insert
        //for insertion at 0th position we update the head as it was pointing to the previous head (10)
        Node newNode= new Node(data);
        
        if(position==0)
        {
            newNode.next=head;
            head=newNode;
            return head;
        }
        //if position is not 0
        Node curr=head;
        for(int i=0;i<position-1;i++)
        {
            curr=curr.next;
            //null pointer exeption handling
            // when user want to insert a node at position which is not present (for ex. 100th position)
            if(curr==null)
            {
                return head;
            }
        }
        
        newNode.next=curr.next;
        curr.next=newNode;
        return head; //it will remain same
    }


	public static void main(String[] args) {
	 
		//print Linkedlist
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		
		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=null;
		printLL(head);
		head=insertLL(100,1,head);
		printLL(head);
		
	}
}

class Node{
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
    }
}
