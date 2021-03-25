import java.util.Stack;

public class Leetcode224_calculate {

    public static void main(String[] args) {
        String s = "-12+(40+51+2)-(23+(-16)+8)";
        System.out.println(calculate(s));;
    }

    public static int calculate(String s){
        Stack<Integer> stack = new Stack<Integer>();
        int sign = 1;
        int res = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int cur = Integer.valueOf(ch + "");
                while(i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))){
                    i++;
                    cur = cur * 10 + Integer.valueOf(s.charAt(i) + "");
                }
                res = res + sign * cur;
            }
            else if(ch == '+'){
                sign = 1;
            }
            else if(ch == '-'){
                sign = -1;
            }
            else if(ch == '('){
                stack.push(res);
                res = 0;
                stack.push(sign);
                sign = 1;
            }
            else if(ch == ')'){
                res = stack.pop() * res + stack.pop();
            }
            else{
                continue;
            }
        }
        return res;
    }
    
}
