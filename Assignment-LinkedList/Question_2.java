package Assignment_Linked_List;

public class Question_2 {
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
    public void insertspecific(int po,int val) {
    	node curr=head;
    	for(curr=head;curr.next!=null&&--po!=0;curr=curr.next) {
    		
    	}
    	node n=new node(val);
    	n.next=curr.next;
    	curr.next=n;
    }
	public static void main(String[] args) {
		Question_2 ll=new Question_2();
		ll.insert(1);
		ll.insert(2);
		ll.insert(4);
		ll.insert(5);
		ll.display();
		int position=2;
		int value=3;
		ll.insertspecific(position,value);
        System.out.println("After Insertion:");
        ll.display();
	}

}
