public class Leetcode226_invertTree {

    public static TreeNode inverTree(TreeNode root){
        if(root == null){
            return null;
        }
        reverse(root);
        return root;
    }

    public static void reverse(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        reverse(root.left);
        reverse(root.right);    
    }
    
}
