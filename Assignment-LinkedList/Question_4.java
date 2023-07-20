package Assignment_Linked_List;

public class Question_4 {
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
    		head=n;
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
    public boolean check_palindrome() {
    	node curr=head;
    	node head2=null;
    	while(curr!=null) {
    		node n=new node(curr.data);
    		n.next=head2;
    		head2=n;
    		curr=curr.next;
    	}
        curr=head;
    	node curr2=head2;
    	while(curr!=null) {
    		if(curr.data!=curr2.data) 
    			return false;
    		curr=curr.next;
    		curr2=curr2.next;
    	}
    	return true;
    }
	public static void main(String[] args) {
		   Question_4 ll=new Question_4();
	       ll.insert(1);
	       ll.insert(1);
	       ll.insert(2);
	       ll.insert(2);
	 	   ll.insert(2);
	 	   ll.insert(2);
	 	   ll.insert(1);
	       ll.insert(1);
	       
	       ll.display();
	       boolean ans=ll.check_palindrome();
           System.out.println(ans);
	}

}
