package Assignment_Stack;
import java.util.*;
public class Question_4 {
    public static Stack<Integer> solve(int [] arr) {
    	Stack<Integer> positive=new Stack<>();
    	Stack<Integer> negative=new Stack<>();
    	int ele=0;
    	int ele2=0;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]<0) {
    			negative.push(arr[i]);
    		}
    		else {
    			positive.push(arr[i]);
    		}
    		while(!positive.empty()&&!negative.empty()) {
    			ele=positive.pop();
    			ele2=negative.pop()*-1;
    			if(ele==ele2) {
    			    continue;
    			}
    			else if(ele<ele2) {
    				negative.push(ele2*-1);
    			}
    			else {
    				positive.push(ele);
    			}
    		}
    		if(positive.empty()) {
    			return negative;
    		}}
       			return positive;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n=sc.nextInt();
		System.out.println("Enter the Array Element:");
		int[] arr=new int[n]; 
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Stack<Integer> ans=solve(arr);
		System.out.println(ans);


	}

}
