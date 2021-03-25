public class Leetcode709_toLowerCase {

    public static void main(String[] args) {
        System.out.println(anotherMethod("Hello"));
    }

    // 利用 ASCII 码和 StringBuilder
    public static String toLowerCase(String str){
        if(str == null || str.length() == 0){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c >= 65 && c <= 90){
                sb.append((char)(c + 32));
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // 利用位运算：
    // 大写转换为小写，小写转换为大写：字符 ^ 32
    // 大写转换为小写，小写转换位大写：字符 |= 32
    public static String anotherMethod(String str){
        if(str == null || str.length() == 0){
            return str;
        }
        char[] ch = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            ch[i] |= 32;
        }
        return String.valueOf(ch);
    }
    
}
