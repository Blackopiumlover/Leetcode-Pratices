public class Leetcode110_isBalanced{


    public boolean isBalanced(TreeNode root){
        if(root == null){
            return true;
        }
        if(Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1){
            return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
    }

    public int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}