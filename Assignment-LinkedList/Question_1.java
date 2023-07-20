package Assignment_Linked_List;


public class Question_1 {
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
    public boolean check(int x) {
    	node curr=head;
    	while(curr!=null) {
    		if(curr.data==x)
    			return true;
    		curr=curr.next;
    	}
    	return false;
    }
	public static void main(String[] args) {
		Question_1 ll=new Question_1();
		ll.insert(10);
		ll.insert(8);
		ll.insert(6);
		ll.insert(4);
		ll.display();
		int x=7;
		boolean ans=ll.check(x);
		System.out.println(ans);
	}

}
