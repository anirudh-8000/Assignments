package Assignment_DivideAndConquer;

import java.util.Arrays;
import java.util.Comparator;

public class Question_5 {

    public static boolean hasOverlap(int[][] intervals) {
        
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        for (int i = 1; i < intervals.length; i++) {
            int[] prevInterval = intervals[i - 1];
            int[] currentInterval = intervals[i];

            if (prevInterval[1] >= currentInterval[0]) {
                return true; 
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        
        int[][] arr1 = {{1, 3}, {5, 7}, {2, 4}, {6, 8}};
        System.out.println(hasOverlap(arr1)); 
    }
}
