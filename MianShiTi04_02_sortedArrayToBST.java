public class MianShiTi04_02_sortedArrayToBST {

    public static void main(String[] args) {
        int[] nums = new int[]{-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(nums);
        preOrder(root);
    }

    public static TreeNode sortedArrayToBST(int[] nums){
        int left = 0;
        int right = nums.length;
        return helper(nums, left, right);
    }

    public static TreeNode helper(int[] nums, int left, int right){
        if(left == right){
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid);
        root.right = helper(nums, mid + 1, right);
        return root;
    }
    
    public static void preOrder(TreeNode root){
        System.out.println(root.val);
        if(root.left != null){
            preOrder(root.left);
        }
        if(root.right != null){
            preOrder(root.right);
        }
    }
}
