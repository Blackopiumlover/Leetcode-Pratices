public class Leetcode938_rangeSumBST {

    public static int rangeSumBST(TreeNode root, int low, int high){
        if(root == null){
            return 0;
        }
        int count = 0;
        if(root.val >= low && root.val <= high){
            count += root.val;
        }
        count += rangeSumBST(root.left, low, high);
        count += rangeSumBST(root.right, low, high);
        return count;
    }

    // 利用搜索二叉树特点剪枝
    public int rangeSum(TreeNode root, int low, int high){
        int sum = 0;
        if(root == null){
            return 0;
        }
        if(root.val < low){
            rangeSum(root.right, low, high);
        }
        else if(root.val > high){
            rangeSum(root.left, low, high);
        }
        else{
            sum += root.val;
            rangeSum(root.left, low, high);
            rangeSum(root.right, low, high);
        }
        return sum;
    }
    
    
}
