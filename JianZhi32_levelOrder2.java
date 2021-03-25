import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
public class JianZhi32_levelOrder2 {

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode L1 = new TreeNode(2);
        TreeNode R1 = new TreeNode(3);
        TreeNode R21 = new TreeNode(4);
        TreeNode R22 = new TreeNode(5);
        root.left = L1;
        root.right = R1;
        R1.left = R21;
        R1.right = R22;
        // root.left = L1;
        // L1.left = R1;
        // R1.left = R21;
        // R21.left = R22;

        // TreeNode n = null;
        List<List<Integer>> l = levelOrder(root);
        
        for(List<Integer> a : l){
            System.out.println(a);
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if(root == null){
            return list;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<Integer>();
            // 注意这里，如果是 i = 0; i < queue.size(); i++
            // 则会出现问题，因为，如果第一次放进的是根，且左右孩子都有
            // 那么第一次循环结束后，左右孩子都放进栈中，queue.size() 变成了 2，而此时 i 是 1
            // 则会多进行一次循环，从而引发错误。
            for(int i = queue.size(); i > 0; i--){
                
                TreeNode node = queue.pop();
                temp.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                
            }
            list.add(temp);
        }
        return list;
    }
}
