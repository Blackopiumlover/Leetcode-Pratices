import java.util.Stack;

public class Leetcode150_evalRPN {

    public static void main(String[] args) {
        String[] tokens1 = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens1));

        String[] tokens2 = {"4","13","5","/","+"};
        System.out.println(evalRPN(tokens2));

        String[] tokens3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens3));

        String[] tokens4 = {"4","3","-"};
        System.out.println(evalRPN(tokens4));
    }

    public static int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(tokens[i].equals("-")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 - temp1);
            }
            else if(tokens[i].equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(tokens[i].equals("/")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp1);
            }
            else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }

        return stack.pop();
    }
    
}
