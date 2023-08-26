package Assignment_BST;

public class Question_5 {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode x, TreeNode y) {
        if (root == null || x == null || y == null) {
            return null;
        }
        
        if (root.val > x.val && root.val > y.val) {
            return lowestCommonAncestor(root.left, x, y);
        } else if (root.val < x.val && root.val < y.val) {
            return lowestCommonAncestor(root.right, x, y);
        } else {
            return root;
        }
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);
        
        TreeNode x = new TreeNode(6);
        TreeNode y = new TreeNode(12);
        
        TreeNode lca = lowestCommonAncestor(root, x, y);
        
        if (lca != null) {
            System.out.println("Lowest Common Ancestor of " + x.val + " and " + y.val + " is: " + lca.val);
        } else {
            System.out.println("One or both nodes are not in the tree.");
        }
    }
}
