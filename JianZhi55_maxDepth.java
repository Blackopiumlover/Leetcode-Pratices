public class JianZhi55_maxDepth {
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        TreeNode L1 = new TreeNode(9);
        TreeNode R1 = new TreeNode(20);
        TreeNode R21 = new TreeNode(15);
        TreeNode R22 = new TreeNode(7);
        root.left = L1;
        root.right = R1;
        R1.left = R21;
        R1.right = R22;
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root){
        int height;
        if(root == null){
            height = 0;
        }
        else{
            height = Math.max(maxDepth(root.left), maxDepth(root.right))  + 1;
        }
        return height;
    }
}
