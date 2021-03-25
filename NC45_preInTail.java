import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NC45_preInTail {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(3);
        TreeNode ll = new TreeNode(4);
        TreeNode lr = new TreeNode(5);
        TreeNode rl = new TreeNode(6);
        TreeNode rr = new TreeNode(7);
        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        r.left = rl;
        r.right = rr;

        for(int[] arr : threeOrders(root)){
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int[][] threeOrders(TreeNode root){
        int[][] ans = new int[3][];
        List<Integer> pre = preOrder(root);
        int[] preOrder = new int[pre.size()];
        for(int i = 0; i < pre.size(); i++){
            preOrder[i] = pre.get(i);
        }
        ans[0] = preOrder;

        List<Integer> in = inOrder(root);
        int[] inOrder = new int[in.size()];
        for(int i = 0; i < in.size(); i++){
            inOrder[i] = in.get(i);
        }
        ans[1] = inOrder;

        List<Integer> tail = tailOrder(root);
        int[] tailOrder = new int[tail.size()];
        for(int i = 0; i < tail.size(); i++){
            tailOrder[i] = tail.get(i);
        }
        ans[2] = tailOrder;
        return ans;
    }

    public static List<Integer> preOrder(TreeNode root){
        List<Integer> list = new LinkedList<Integer>();
        if(root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(!stack.isEmpty() || root != null){
            while(root != null){
                list.add(root.val);
                stack.push(root);
                root = root.left;
            }
            if(!stack.isEmpty()){
                root = stack.pop();
                root = root.right;
            }
        }
        return list;
    }
    

    public static List<Integer> inOrder(TreeNode root){
        List<Integer> list = new LinkedList<Integer>();
        if(root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(!stack.isEmpty() || root != null){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            if(!stack.isEmpty()){
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }

    public static List<Integer> tailOrder(TreeNode root){
        List<Integer> list = new LinkedList<Integer>();
        if(root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> s = new Stack<Integer>();
        int left = 1;
        int right = 2;
        while(!stack.isEmpty() || root != null){
            while(root != null){
                stack.push(root);
                s.push(left);
                root = root.left;
            }

            while(!stack.isEmpty() && s.peek() == right){
                s.pop();
                list.add(stack.pop().val);
            }
            
            if(!stack.isEmpty() && s.peek() == left){
                s.pop();
                s.push(right);
                root = stack.peek().right;
            }
        }
        return list;
    }
}
