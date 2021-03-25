import java.util.Stack;

public class Leetcode227_calculate {

    public static void main(String[] args) {
        String s = "12 + 16 * 2+14 - 5 /5";
        String s1 = "3/2";
        System.out.println(calculate(s));
        System.out.println(calculate(s1));
    }

    public static int calculate(String s){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int index = i;
                int number = 0;
                while(index < s.length() && Character.isDigit(s.charAt(index))){
                    number = number * 10 + Integer.valueOf(s.charAt(index) + "");
                    index++;
                }
                i = index - 1;
                stack.push(number);
            }
            else if(ch == ' '){
                continue;
            }
            else if(ch == '+'){
                continue;
            }
            else if(ch == '-'){
                stack.push(-1);
            }
            else if(ch == '*'){
                int index = i + 1;
                int number = 0;
                while(index < s.length()){
                    if(s.charAt(index) == ' '){
                        index++;
                        continue;
                    }
                    else if(Character.isDigit(s.charAt(index))){
                        number = number * 10 + Integer.valueOf(s.charAt(index) + "");
                        index++;
                    }
                    else{
                        break;
                    }
                }
                i = index - 1;
                // System.out.println(stack.peek());
                // System.out.println(number);
                stack.push(stack.pop() * number);
            }
            else if(ch == '/'){
                int index = i + 1;
                int number = 0;
                while(index < s.length()){
                    if(s.charAt(index) == ' '){
                        index++;
                        continue;
                    }
                    else if(Character.isDigit(s.charAt(index))){
                        number = number * 10 + Integer.valueOf(s.charAt(index) + "");
                        index++;
                    }
                    else{
                        break;
                    }
                }
                i = index - 1;
                stack.push(stack.pop() / number);
            }
        }
        System.out.println(stack);
        
        int ans = 0;
        while(!stack.isEmpty()){
            int number = stack.pop();
            if(!stack.isEmpty() && stack.peek() == -1){
                stack.push(stack.pop() * number);
                continue;
            }
            ans += number;
        }
        return ans;
    }
    
}
