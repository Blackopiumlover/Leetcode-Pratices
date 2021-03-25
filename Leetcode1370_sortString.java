public class Leetcode1370_sortString {

    public static void main(String[] args) {
        String s = "spo";
        System.out.println(sortString(s));
    }

    public static String sortString(String s){
        int[] chars = new int[26];
        for(char c : s.toCharArray()){
            chars[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while(count < s.length()){
            for(int i = 0; i < chars.length; i++){
                if(chars[i] != 0){
                    sb.append((char)('a' + i));
                    chars[i] -= 1;
                    count += 1;
                }
            }
            for(int i = chars.length - 1; i >= 0; i--){
                if(chars[i] != 0){
                    sb.append((char)('a' + i));
                    chars[i] -= 1;
                    count += 1;
                }
            }
        }
        return sb.toString();
    }
    
}
