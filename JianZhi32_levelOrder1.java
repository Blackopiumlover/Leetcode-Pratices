import java.util.LinkedList;
public class JianZhi32_levelOrder1 {
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode L1 = new TreeNode(9);
        TreeNode R1 = new TreeNode(20);
        TreeNode R21 = new TreeNode(15);
        TreeNode R22 = new TreeNode(7);
        root.left = L1;
        root.right = R1;
        R1.left = R21;
        R1.right = R22;

        TreeNode n = null;

        int[] ans = levelOrder(n);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }

    public static int[] levelOrder(TreeNode root){
        int[] ans = new int[0];
        if(root == null){
            return ans;
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.pop();
            list.add(node.val);
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
        }
        ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
