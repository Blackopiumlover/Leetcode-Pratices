import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class JianZhi48_lengthOfLongestSubstring {

    public static void main(String[] args) {
        String s1 = "abba";
        System.out.println(anotherMethod(s1));
    }

    // 暴力破解法：
    public static int lengthOfLongestSubstring(String s){
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            HashSet<Character> set = new HashSet<Character>();
            set.add(s.charAt(i));
            int len = 1;
            for(int j = i + 1; j < s.length(); j++){
                if(set.add(s.charAt(j))){
                    len += 1;
                }
                else{
                    break;
                }
            }
            if(max < len){
                max = len;
            }
        }
        return max;
    }

    // HashMap + 双指针
    public static int anotherMethod(String s){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int left = -1;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                // 保证 left + 1 到 j 内，不存在重复字符
                // 注意：因为 left 左侧的字符在 map 中仍旧存在，
                // 这里需要比较 left 和新发现的重复索引，如 abba，
                // i = 3 时，因为 map 中已经存在了 a-0，所以 left 会左移 = 0
                // 就破坏了 left + 1 到 j 内，不存在重复字符的规矩
                left = Math.max(left, map.get(s.charAt(i)));
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left);
        }
        return max;
    }
    
}
