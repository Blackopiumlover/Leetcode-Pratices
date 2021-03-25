import java.util.Deque;
import java.util.LinkedList;

public class Leetcode1047_removeDuplicates {

    public static void main(String[] args) {
        String S = "abbaca";
        System.out.println(removeDuplicates(S));
    }

    public static String removeDuplicates(String S){
        Deque<Character> stack = new LinkedList<Character>();
        for(int i = 0; i < S.length(); i++){
            if(stack.isEmpty()){
                stack.push(S.charAt(i));
            }
            else{
                if(stack.peek() == S.charAt(i)){
                    stack.pop();
                }
                else{
                    stack.push(S.charAt(i));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();

    }
    
}
