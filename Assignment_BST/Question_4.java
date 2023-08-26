package Assignment_BST;

public class Question_4 {
    public static TreeNode inorderPredecessor(TreeNode root, int key) {
        TreeNode predecessor = null;
        
        while (root != null) {
            if (key <= root.val) {
                root = root.left;
            } else {
                predecessor = root;
                root = root.right;
            }
        }
        
        return predecessor;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);
        
        int[] keys = {15, 10, 20, 8, 12, 16, 25};
        
        for (int key : keys) {
            TreeNode pred = inorderPredecessor(root, key);
            if (pred != null) {
                System.out.println("The predecessor of node " + key + " is: " + pred.val);
            } else {
                System.out.println("The predecessor doesn't exist for node " + key);
            }
        }
    }
}
