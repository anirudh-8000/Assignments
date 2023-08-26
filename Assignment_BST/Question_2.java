package Assignment_BST;

public class Question_2 {
    private static int count;
    
    public static TreeNode kthLargest(TreeNode root, int k) {
        count = 0;
        return kthLargestUtil(root, k);
    }
    
    private static TreeNode kthLargestUtil(TreeNode node, int k) {
        if (node == null) {
            return null;
        }
        
        TreeNode right = kthLargestUtil(node.right, k);
        
        if (right != null) {
            return right;
        }
        
        count++;
        if (count == k) {
            return node;
        }
        
        return kthLargestUtil(node.left, k);
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);
        
        int k = 2;
        TreeNode kthNode = kthLargest(root, k);
        
        if (kthNode != null) {
            System.out.println("The " + k + "th largest node is: " + kthNode.val);
        } else {
            System.out.println("Invalid value of k.");
        }
    }
}
