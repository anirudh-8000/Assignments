package Assignment_DivideAndConquer;

import java.util.*;

public class Question_4 {

    public static String canPermuteToSumK(int[] a, int[] b, int k) {
        int n = a.length;
        Arrays.sort(a);
        Arrays.sort(b);

        int pointerA = 0;
        int pointerB = n - 1;

        while (pointerA < n && pointerB >= 0) {
            if (a[pointerA] + b[pointerB] >= k) {
                return "Yes";
            }
            pointerA++;
            pointerB--;
        }

        return "No";
    }

    public static void main(String[] args) {
        int[] a1 = {2, 1, 3};
        int[] b1 = {7, 8, 9};
        int k1 = 10;
        System.out.println(canPermuteToSumK(a1, b1, k1)); 
    }
}

