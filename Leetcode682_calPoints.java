import java.util.Stack;

public class Leetcode682_calPoints {

    public static int calPoints(String[] ops){
        Stack<Integer> stack = new Stack<Integer>();

        for(String s : ops){
            if(s.equals("C")){
                stack.pop();
            }
            else if(s.equals("D")){
                stack.push(stack.pop() * 2);
            }
            else if(s.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else{
                stack.push(Integer.valueOf(s));
            }
        }

        int res = 0;
        while(!stack.isEmpty()){
            res += stack.pop();
        }
        return res;
    }
    
}
