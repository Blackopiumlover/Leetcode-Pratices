public class MianShiTi01_09_isFlipedString {

    public static void main(String[] args) {
        String s1 = "aba";
        String s2 = "bab";
        System.out.println(isFliped(s1, s2));
    }
    // 暴力解法，当字符串长度过长时运行超时
    public static boolean isFlipedString(String s1, String s2){
        if((s1 == null || s1.length() == 0) && (s2 == null || s2.length() == 0)){
            return true;
        }
        for(int i = 0; i < s1.length(); i++){
            char c = s1.charAt(0);
            StringBuilder sb = new StringBuilder();
            sb.append(s1.substring(1));
            sb.append(c);
            if(sb.toString().equals(s2)){
                return true;
            }
            s1 = sb.toString();
        }
        return false;
    }
    
    public static boolean isFliped(String s1, String s2){
        // 特殊情况判断
        if (s1 == null && s2 == null) {
            return true;
        }
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 != len2) {
            return false;
        }
        int i = 0;
        // 寻找旋转点核心步骤，见思路描述
        while (s2.indexOf(s1.substring(0, i + 1)) != -1) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        // 拼接旋转点左右两部分
        sb.append(s1.substring(i, len1));
        sb.append(s1.substring(0, i));
        return sb.toString().equals(s2);
    }
}
