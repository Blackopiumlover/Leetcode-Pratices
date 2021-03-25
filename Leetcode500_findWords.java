import java.util.ArrayList;
import java.util.List;

public class Leetcode500_findWords {

    public static void main(String[] args) {
        String[] words = {"adsdf","sfd"};
        String[] strs = findWords(words);
        for(String str : strs){
            System.out.print(str + " ");
        }
    }

    static final String s1 = "qwertyuiop";
    static final String s2 = "asdfghjkl";
    static final String s3 = "zxcvbnm";
    public static String[] findWords(String[] words) {
        List<String> str = new ArrayList<String>();
        for(String s : words){
            boolean is = true;
            String ch = s.toLowerCase();

            char c = ch.charAt(0);


            if(s1.indexOf(c) >= 0){

                for(int i = 1; i < ch.length(); i++){
                    if(s1.indexOf(ch.charAt(i)) < 0){
                        is = false;
                        break;
                    }
                }
                if(is){
                    str.add(s);
                }
            }
            else if(s2.indexOf(c) >= 0){

                for(int i = 1; i < ch.length(); i++){
                    if(s2.indexOf(ch.charAt(i)) < 0){
                        is = false;
                        break;
                    }
                }
                if(is){
                    str.add(s);
                }
            }
            else if(s3.indexOf(c) >= 0){

                for(int i = 1; i < ch.length(); i++){
                    if(s3.indexOf(ch.charAt(i)) < 0){
                        is = false;
                        break;
                    }
                }
                if(is){
                    str.add(s);
                }
            }
        }

        // System.out.println(str);
        
        String[] ans = new String[str.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = str.get(i);
        }
        return ans;
    }
    
}
