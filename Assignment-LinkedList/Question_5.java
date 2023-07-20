package Assignment_Linked_List;

public class Question_5 {
	
	class node{
		int data;
	    node next;
	    node(int data){
	    	this.data=data;
	    	next=null;
	    }
	}
	public node insert(node head,int data) {
    	node n=new node(data);
    	if(head==null) {
    		head=n;
    		return head;
    	}
    	node curr=head;
    	while(curr.next!=null) {
    		curr=curr.next;
    	}
    	curr.next=n;
    	return head;
    }
	 public void display(node head) {
	    	node curr=head;
	    	while(curr!=null) {
	    		System.out.print(curr.data+" ");
	    		curr=curr.next;
	    	}
	    	System.out.println();
	  }
	 public static node reverse(node curr, node prev,node head){
	        if(curr.next == null){
	            head = curr;
	            curr.next = prev;
	            return head;
	        }
            node nextPtr = curr.next;
	        curr.next = prev;
	        head=reverse(nextPtr, curr,head);
	        return head;
	    }
     public node addition(node head1,node head2) {
    	 head1=reverse(head1,null,head1);
    	 head2=reverse(head2,null,head2);
    	 Question_5 ll=new Question_5();
         node head3=null;
         node curr1=head1;
         node curr2=head2;
         int carry=0;
         while(curr1!=null&& curr2!=null) {
        	 int num=curr1.data+curr2.data+carry;
        	 curr1=curr1.next;
        	 curr2=curr2.next;
        	 carry=num/10;
        	 num=num%10;
        	 head3=ll.insert(head3, num);
         }
         while(curr1!=null) {
        	 int num=curr1.data+carry;
        	 curr1=curr1.next;
        	 carry=num/10;
        	 num=num%10;
        	 head3=ll.insert(head3, num);
         }
         while(curr2!=null) {
        	 int num=curr2.data+carry;
        	 curr2=curr2.next;
        	 carry=num/10;
        	 num=num%10;
        	 head3=ll.insert(head3, num);
         }
         if(carry>0) {
        	 head3=ll.insert(head3, carry);
         }
         head3=reverse(head3,null,head3);
         return head3;
     }
	public static void main(String[] args) {
		node head1=null;
		node head2=null;
		Question_5 ll=new Question_5();
		head1=ll.insert(head1,3);
		head1=ll.insert(head1,4);
		head1=ll.insert(head1,5);
		head2=ll.insert(head2, 1);
		head2=ll.insert(head2, 2);
		head2=ll.insert(head2, 9);
		head2=ll.insert(head2, 9);
        ll.display(head1);
        ll.display(head2);
        node head3=ll.addition(head1,head2);
        System.out.println("Addition is:");
        ll.display(head3);
	}

}
