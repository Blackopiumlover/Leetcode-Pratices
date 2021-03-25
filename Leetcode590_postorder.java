import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Leetcode590_postorder {

    // 迭代
    public List<Integer> postorder(Node root){
        Stack<Node> stack = new Stack<Node>();
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            Node temp = stack.pop();
            list.add(temp.val);
            for(Node child : temp.children){
                stack.push(child);
            }
        }
        Collections.reverse(list);
        return list;
    }
    
    // 递归
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> anotherMethod(Node root){
        if(root == null){
            return list;
        }
        for(Node temp : root.children){
            anotherMethod(temp);
        }
        list.add(root.val);
        return list;
    }
}
