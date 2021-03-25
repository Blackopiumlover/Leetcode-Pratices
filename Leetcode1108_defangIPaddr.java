public class Leetcode1108_defangIPaddr {

    public static void main(String[] args) {
        String address = "a.b.c.d";
        System.out.println(defangIPaddr(address));
    }
    // 注意：
    // java.lang.String.split 用于分割常规表达式
    // "." 在常规表达式中等于 任意字符 "any character"
    // 用转义字符 "\\." 来代替
    // 或者用 split(Pattern.quote(".")); 来代替
    public static String defangIPaddr(String address){
        String[] contexts = address.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < contexts.length; i++){
            if(i == contexts.length - 1){
                sb.append(contexts[i]);
                break;
            }
            sb.append(contexts[i]);
            sb.append("[.]");
        }
        return sb.toString();
    }
    
}
