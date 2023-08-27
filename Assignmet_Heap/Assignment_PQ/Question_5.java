package Assignment_PQ;
import java.io.*;
import java.util.*;
class Question_5 {

    private static Queue<Integer> minHeap, maxHeap;

    static void add(int num) {
        if (!minHeap.isEmpty() && num < minHeap.peek()) {
            maxHeap.offer(num);
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.offer(maxHeap.poll());
            }
        } else {
            minHeap.offer(num);
            if (minHeap.size() > maxHeap.size() + 1) {
                maxHeap.offer(minHeap.poll());
            }
        }
    }

    static double getMedian() {
        int median;
        if (minHeap.size() < maxHeap.size()) {
            median = maxHeap.peek();
        } else if (minHeap.size() > maxHeap.size()) {
            median = minHeap.peek();
        } else {
            median = (minHeap.peek() + maxHeap.peek()) / 2; 
        }
        return median;
    }
    
    static void initialize(){
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        
        Question_5 obj = new Question_5();
        
        obj.add(3);
        System.out.println("The median is : " + getMedian());
         obj.add(3);
         obj.add(2);
         obj.add(5);
        System.out.println("The median is : " + getMedian());
         obj.add(7);
         obj.add(12);
        System.out.println("The median is : " + getMedian());
    }

	public static void main(String[] args){
		initialize();
	}
}