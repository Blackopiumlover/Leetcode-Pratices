import java.util.LinkedList;

public class JianZhi27_mirrorTree {
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode L1 = new TreeNode(2);
        TreeNode R1 = new TreeNode(7);
        TreeNode L21 = new TreeNode(1);
        TreeNode L22 = new TreeNode(3);
        TreeNode R21 = new TreeNode(6);
        TreeNode R22 = new TreeNode(9);
        root.left = L1;
        root.right = R1;
        L1.left = L21;
        L1.right = L22;
        R1.left = R21;
        R1.right = R22;
        levelOrder(root);

        levelOrder(mirrorTree(root));
    }

    public static TreeNode mirrorTree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }

    public static void levelOrderTraverse(TreeNode root, LinkedList<Integer> list){
        if(root == null) {
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
        }
    }
    public static void levelOrder(TreeNode root){
        LinkedList<Integer> list = new LinkedList<Integer>();
        levelOrderTraverse(root, list);
        System.out.println(list);
    }
}

