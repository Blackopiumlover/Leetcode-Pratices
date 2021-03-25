import java.util.Stack;

public class Leetcode20_isValid {

    public static void main(String[] args) {
        String s = "){";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        if(s.length() % 2 == 1){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else{
                if(s.charAt(i) == ')'){
                    if(stack.isEmpty()){
                        return false;
                    } 
                    else if(stack.peek() != '('){
                        return false;
                    }
                    else{
                        stack.pop();
                    }
                }
                if(s.charAt(i) == ']'){
                    if(stack.isEmpty()){
                        return false;
                    }
                    else if(stack.peek() != '['){
                        return false;
                    }
                    else{
                        stack.pop();
                    }
                }
                if(s.charAt(i) == '}'){
                    if(stack.isEmpty()){
                        return false;
                    }
                    else if(stack.peek() != '{'){
                        return false;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    
}
