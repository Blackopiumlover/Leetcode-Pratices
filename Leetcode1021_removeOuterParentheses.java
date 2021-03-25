public class Leetcode1021_removeOuterParentheses {

    public static void main(String[] args) {
        String s = "()()";
        System.out.println(removeOuterString(s));
    }

    public static String removeOuterString(String s){
        char[] chars = s.toCharArray();
        int[] levels = new int[chars.length];
        levels[0] = 1;
        for(int i = 1; i < chars.length; i++){
            if(chars[i] == '('){
                if(chars[i - 1] == '('){
                    levels[i] = levels[i - 1] + 1;
                }
                if(chars[i - 1] == ')'){
                    levels[i] = levels[i - 1];
                }
            }
            if(chars[i] == ')'){
                if(chars[i - 1] == '('){
                    levels[i] = levels[i - 1];
                }
                if(chars[i - 1] == ')'){
                    levels[i] = levels[i - 1] - 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < levels.length; i++){
            if(levels[i] == 1){
                continue;
            }
            sb.append(chars[i]);
        }
        return sb.toString();
    }
    
}
