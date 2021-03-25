
import java.util.HashMap;

public class JianZhi50_firstUniqChar {

    public static void main(String[] args) {
        String s1 = "abaccdeff";
        // String s2 = "";
        // String s3 = "cc";
        char ans = firstUniqChar(s1);
        System.out.println(ans);
    }
    // 能够解决问题，但是解决不了超长字符串
    // public static char firstUniqChar(String s){
    // if(s.equals("") || s.length() == 0){
    // return ' ';
    // }
    // for(int i = 0; i < s.length(); i++){
    // int number = 0;
    // char temp = s.charAt(i);
    // for(int j = 0; j < s.length(); j++){
    // if(s.charAt(j) == temp){
    // number = number + 1;
    // }
    // }
    // if(number == 1){
    // return temp;
    // }
    // }
    // return ' ';
    // }
    
    // 如果这个字符第一次出现的索引 indexOf(c) 等于最后一次出现的索引 lastIndexOf(c)，
    // 那么这个字符就只出现了一次
    // public static char firstUniqChar(String s) {
    //     if (s.equals("") || s.length() == 0) {
    //         return ' ';
    //     }
    //     char[] arr = s.toCharArray();
    //     for(char c : arr){
    //         if(s.indexOf(c) == s.lastIndexOf(c)){
    //             return c;
    //         }
    //     }
    //     return ' ';
    // }

    public static char firstUniqChar(String s){
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(!dic.containsKey(c)){
                dic.put(c, true);
            }
            else{
                dic.replace(c, false);
            }
        }
        for(char c : arr){
            if(dic.get(c)){
                return c;
            }
        }
        return ' ';
    }

}
