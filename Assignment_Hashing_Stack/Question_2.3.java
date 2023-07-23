package Assignment_Stack;
import java.util.Stack;

public class Question_3 {
    public static int baseballGameScore(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String op : operations) {
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (op.equals("+")) {
                int lastScore = stack.pop();
                int newScore = lastScore + stack.peek();
                stack.push(lastScore);
                stack.push(newScore);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int totalSum = 0;
        while (!stack.isEmpty()) {
            totalSum += stack.pop();
        }

        return totalSum;
    }

    public static void main(String[] args) {
        String[] ops = {"5", "2", "C", "D", "+"};
        System.out.println(baseballGameScore(ops)); 
    }
}

