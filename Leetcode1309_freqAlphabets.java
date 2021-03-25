import java.util.Stack;

public class Leetcode1309_freqAlphabets {

    public static void main(String[] args) {
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s){
        int index = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        while(index < s.length()){
            stack.push(s.charAt(index));
            if(stack.peek() == '#'){
                stack.pop();
                int code = (int)(stack.pop() - 48) + (int)(stack.pop() - 48) * 10 + 96;
                sb1.append((char)code);

                while(!stack.isEmpty()){
                    sb1.append((char)((int)(stack.pop() - 48) + 96));
                }
                sb2.append(sb1.reverse());
                sb1.delete(0, sb1.capacity());
            }
            index += 1;
        }
        while(!stack.isEmpty()){
            sb1.append((char)((int)(stack.pop() - 48) + 96));
        }
        sb2.append(sb1.reverse());
        return sb2.toString();
    }
    
}
