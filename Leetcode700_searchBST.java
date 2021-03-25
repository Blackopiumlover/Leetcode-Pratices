public class Leetcode700_searchBST {


    public TreeNode searchBST(TreeNode root, int val){
        if(root == null){
            return root;
        }
        if(root.val == val){
            return root;
        }
        if(root.val < val && root.right != null){
            return searchBST(root.right, val);
        }
        if(root.val > val && root.left != null){
            return searchBST(root.left, val);
        }
        return null;

    }
    
}
