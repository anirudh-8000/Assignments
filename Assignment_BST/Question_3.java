package Assignment_BST;
import java.util.*;

public class Question_3 {
    public static boolean findPair(TreeNode root, int targetSum) {
        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();
        TreeNode left = root, right = root;
        
        while (true) {
            while (left != null) {
                leftStack.push(left);
                left = left.left;
            }
            
            while (right != null) {
                rightStack.push(right);
                right = right.right;
            }
            
            if (leftStack.isEmpty() || rightStack.isEmpty() || leftStack.peek() == rightStack.peek()) {
                break;
            }
            
            TreeNode leftNode = leftStack.peek();
            TreeNode rightNode = rightStack.peek();
            int sum = leftNode.val + rightNode.val;
            
            if (sum == targetSum) {
                System.out.println("Pair found: (" + leftNode.val + ", " + rightNode.val + ")");
                return true;
            } else if (sum < targetSum) {
                leftStack.pop();
                left = leftNode.right;
            } else {
                rightStack.pop();
                right = rightNode.left;
            }
        }
        
        System.out.println("No pair found with the given sum.");
        return false;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);
        
        int targetSum = 14;
        findPair(root, targetSum);
    }
}
