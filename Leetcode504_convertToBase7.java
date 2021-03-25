import java.util.Stack;

public class Leetcode504_convertToBase7 {

    public static void main(String[] args) {
        System.out.println(convertToBase7(-8));
    }

    public static String convertToBase7(int num){
        if(num == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        int op = num;
        while(num != 0){
            stack.push(num % 7);
            num = num / 7;
        }
        if(op > 0){
            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }
        }
        if(op < 0){
            int ans = 0;
            while(!stack.isEmpty()){
                ans = ans * 10 + Math.abs(stack.pop());
            }
            ans = 0 - ans;
            sb.append(ans);
        }
        return sb.toString();
    }
    
}
