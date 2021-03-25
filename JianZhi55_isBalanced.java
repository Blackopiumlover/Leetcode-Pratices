public class JianZhi55_isBalanced {
    // 两次递归，100% 时间复杂度
    public static void main(String[] args){
        // TreeNode root = new TreeNode(3);
        // TreeNode L1 = new TreeNode(9);
        // TreeNode R1 = new TreeNode(20);
        // TreeNode R21 = new TreeNode(15);
        // TreeNode R22 = new TreeNode(7);
        // root.left = L1;
        // root.right = R1;
        // R1.left = R21;
        // R1.right = R22;

        TreeNode root = new TreeNode(1);
        TreeNode L1 = new TreeNode(2);
        TreeNode R1 = new TreeNode(2);
        TreeNode L21 = new TreeNode(3);
        TreeNode L22 = new TreeNode(3);
        TreeNode L31 = new TreeNode(4);
        TreeNode L32 = new TreeNode(4);
        root.left = L1;
        root.right = R1;
        L1.left = L21;
        L1.right = L22;
        L21.left = L31;
        L21.right = L32;
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root){
        if(root == null){
            return true;
        }
        if(Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1){
            return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
    }
    
    public static int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}
