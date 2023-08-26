package Assignment_BST;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Question_1 {
    public static TreeNode search(TreeNode root, int key) {
        while (root != null) {
            if (key == root.val) {
                return root;
            } else if (key < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);
        
        int searchKey = 25;
        TreeNode result = search(root, searchKey);
        
        if (result != null) {
            TreeNode parent = findParent(root, result);
            if (parent != null && parent.right == result) {
                System.out.println("The given key is the right node of the node with key " + parent.val);
            } else {
                System.out.println("The given key is not the right node of any node.");
            }
        } else {
            System.out.println("Key " + searchKey + " not found in the BST.");
        }
    }
    
    public static TreeNode findParent(TreeNode root, TreeNode target) {
        TreeNode parent = null;
        while (root != null && root != target) {
            parent = root;
            if (target.val < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return parent;
    }
}

