import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Leetcode589_preorder {
    List<Integer> list = new LinkedList<Integer>();
    Queue<Node> queue = new LinkedList<Node>();
    
    // 递归
    public List<Integer> preorder(Node root){ 
        if(root == null){
            return list;
        }   
        queue.add(root);
        for(Node node : root.children){
            preorder(node);
        }
        while(!queue.isEmpty()){
            list.add(queue.poll().val);
        }
        return list;
    }
    
    // 迭代
    public List<Integer> another(Node root){
        Stack<Node> stack = new Stack<Node>();
        if(root == null){
            return list;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            list.add(node.val);
            for(int i = node.children.size() - 1; i >= 0; i--){
                stack.push(node.children.get(i));
            }
        }
        return list;
    }

}
