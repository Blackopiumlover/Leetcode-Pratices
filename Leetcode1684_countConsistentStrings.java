public class Leetcode1684_countConsistentStrings {

    public static void main(String[] args) {
        String allowed = "ac";
        System.out.println(encode(allowed));
        String[] words = new String[]{"ad","bd","aaab","baa","badb"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    // 暴力破解法：
    public static int countConsistentStrings(String allowed, String[] words){
        int count = 0;
        for(int i = 0; i < words.length; i++){
            if(helper(allowed, words[i])){
                count = count + 1;
            }
        }
        return count;
    }

    public static boolean helper(String allowed, String tested){
        for(int j = 0; j < tested.length(); j++){
            if(allowed.indexOf(tested.charAt(j)) < 0){
                return false;
            }
        }
        return true;
    }

    // 转化为二进制编码法：
    public static int anotherMethod(String allowed, String[] words){
        int encoded = encode(allowed);
        int count = 0;
        for(String word : words){
            int result = encode(word);
            if((result & encoded) == result){
                count++;
            }
        }
        return count;
    }

    // ab -> 0011 -> 3
    // ac -> 0101 -> 5
    public static int encode(String s){
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            int x = s.charAt(i) - 'a';
            ans = ans | (1 << x);
        }
        return ans;
    }
}
