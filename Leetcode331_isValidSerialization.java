import java.util.Stack;

public class Leetcode331_isValidSerialization {

    public static void main(String[] args) {
        String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        System.out.println(isValidSerialization(preorder));
    }

    public static boolean isValidSerialization(String preorder){
        String[] pre = preorder.split(",");

        if(pre.length == 1){
            return pre[0].equals("#");
        }
        if(pre.length < 3){
            // System.out.println(1);
            return false;
        }

        if(pre.length % 2 == 0){
            // System.out.println(2);
            return false;
        }

        if(pre.length >= 3 && pre[0].equals("#")){
            // System.out.println(3);
            return false;
        }

        Stack<String> stack = new Stack<String>();
        stack.push(pre[0]);
        
        int index = 1;
        while(index < pre.length){
            // 一直找左孩子，直到是 # 为止，其余元素全部放进栈
            if(!pre[index].equals("#")){
                stack.push(pre[index]);
                index++;
            }
            else{
                // 当前 pre[index] 是 "#"，也就是说当前栈顶的元素左孩子是 "#"
                if(stack.isEmpty()){
                    // System.out.println(4);
                    return index == pre.length - 1;
                }
                else{
                    stack.pop();
                    index++;
                }
            }
        }
        // System.out.println(5);
        System.out.println(stack);
        return stack.isEmpty();
    }
    
}
