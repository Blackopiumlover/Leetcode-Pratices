import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1704_halvesAreAlike {

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("textbook"));
    }

    public static boolean halvesAreAlike(String s){
        ArrayList<Character> list = new ArrayList<Character>();
        List<Character> l = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        list.addAll(l);
        int left = 0;
        int lc = 0;
        int right = s.length() / 2;
        int rc = 0;
        while(right < s.length()){
            if(l.contains(s.charAt(left))){
                lc++;
            }
            if(l.contains(s.charAt(right))){
                rc++;
            }
            left++;
            right++;
        }
        return lc == rc;
    }
    
}
