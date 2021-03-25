import java.util.HashSet;
import java.util.Set;

public class Leetcode804_uniqueMorseRepresentations {

    public static void main(String[] args) {
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));;
    }

    public static int uniqueMorseRepresentations(String[] words){
        String[] codes = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<String>();
        int count = 0;
        for(String str : words){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < str.length(); i++){
                sb.append(codes[str.charAt(i) - 'a']);
            }
            // System.out.println(sb.toString());
            if(set.add(sb.toString())){
                count++;
            }
        }
        return count;
    }
    
}
