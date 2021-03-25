public class Leetcode557_reverseWords {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s){
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            // System.out.println(str);
            for(int i = str.length() - 1; i >= 0 ; i--){
                sb.append(str.charAt(i));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    
}
