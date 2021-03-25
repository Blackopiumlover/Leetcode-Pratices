import java.util.Stack;
public class JianZhi58_reverseWords {

    public static void main(String[] args) {
        // String s1 = "the sky is blue";
        // System.out.println(reverseWords(s1));

        // String s2 = "  hello world!";
        // System.out.println(reverseWords(s2));

        String s3 = "a good   example";
        System.out.println(reverseWords(s3));
    }

    public static String reverseWords(String s){
        s = s.trim();
        String[] words = s.split(" ");
        
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < words.length; i++){
            stack.push(words[i]);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            String part = stack.pop();
            if(part.equals("")){
                continue;
            }
            if(stack.size() == 0){
                sb.append(part);
            }
            else{
                sb.append(part + " ");
            }
        }
        return sb.toString().trim();
    }
    
}
