package Assignment_Linked_List;

public class Question_3 {
	node head;
	class node{
		int data;
	    node next;
	    node(int data){
	    	this.data=data;
	    	next=null;
	    }
	}
    public void insert(int data) {
    	node n=new node(data);
    	if(head==null) {
    		head=new node(data);
    		return;
    	}
    	node curr=head;
    	while(curr.next!=null) {
    		curr=curr.next;
    	}
    	curr.next=n;
    	return;
    }
    public void display() {
    	node curr=head;
    	while(curr!=null) {
    		System.out.print(curr.data+" ");
    		curr=curr.next;
    	}
    	System.out.println();
    }
    public void unique() {
    	node curr=head;
    	while(curr.next!=null) {
    		if(curr.data==curr.next.data)
    			curr.next=curr.next.next;
    		else
    		    curr=curr.next;
    	}
    }
     public static void main(String[] args) {
    	 Question_3 ll=new Question_3();
        ll.insert(1);
        ll.insert(1);
        ll.insert(2);
 		ll.insert(2);
 		ll.insert(2);
 		ll.insert(3);
 		ll.insert(3);
 		ll.insert(3);
 		ll.insert(3);
 		ll.display();
 		ll.unique();
 		System.out.println("After remove duplicates:");
 		ll.display();
     }
}
