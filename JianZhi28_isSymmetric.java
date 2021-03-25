public class JianZhi28_isSymmetric {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode L1 = new TreeNode(2);
        TreeNode R1 = new TreeNode(2);
        TreeNode L21 = new TreeNode(3);
        TreeNode L22 = new TreeNode(4);
        TreeNode R21 = new TreeNode(4);
        TreeNode R22 = new TreeNode(3);
        root.left = L1;
        root.right = R1;
        L1.left = L21;
        L1.right = L22;
        R1.left = R21;
        R1.right = R22;

        boolean isSymmetric = isSymmetric(root);
        System.out.println(isSymmetric);
    }
    public static boolean isSymmetric(TreeNode root){
        if(root == null){
            return true;
        }
        return helper(root.left, root.right);
    }
    public static boolean helper(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return left.val == right.val && helper(left.left, right.right) && helper(left.right, right.left);
    }
    
}
