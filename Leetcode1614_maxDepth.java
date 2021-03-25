public class Leetcode1614_maxDepth {

    public static void main(String[] args) {
        String s = "1";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s){
        int level = 0;
        int maxDepth = 0;
        if(s == null || s.length() == 0 || s.length() == 1){
            return 0;
        }
        if(s.charAt(0) == '('){
            level = 1;
            maxDepth = 1;
        }
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == '('){
                level = level + 1;
                if(level > maxDepth){
                    maxDepth = level;
                }
            }
            if(s.charAt(i) == ')'){
                level = level - 1;
            }
        }
        return maxDepth;
    }
    
}
