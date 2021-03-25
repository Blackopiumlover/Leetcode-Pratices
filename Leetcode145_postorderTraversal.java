import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Leetcode145_postorderTraversal{

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(2);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(1);
        TreeNode f = new TreeNode(4);
        TreeNode g = new TreeNode(2);
        TreeNode h = new TreeNode(2);
        TreeNode i = new TreeNode(3);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.left = h;
        e.right = i;
        System.out.println(postorderTraversal(a));
    }

    public static List<Integer> postorderTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        // if(root == null){
        //     return list;
        // }

        // TreeNode node = null;
        // while(root != null || !stack.isEmpty()){
        //     while(root != null){
        //         stack.push(root);
        //         root = root.left;
        //     }
        //     root = stack.pop();
        //     if(root.right == null || root.right == node){
        //         list.add(root.val);
        //         node = root;
        //         root = null;
        //     }
        //     else{
        //         stack.push(root);
        //         root = root.right;
        //     }
        // }

        if(root == null){
            return list;
        }
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                list.addFirst(root.val);
                root = root.right;
            }
            root = stack.pop();
            if(root.left == null){
                root = null;
            }
            else{
                root = root.left;
            }
        }
        return list;
    }
}