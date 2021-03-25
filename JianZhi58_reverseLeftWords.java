public class JianZhi58_reverseLeftWords {
    
    public static void main(String[] args){
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseLeftWords1(s, k));
    }

    public static String reverseLeftWords1(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
        }
        String newHead = s.substring(n);
        return newHead + sb.toString();
    }

    public static String reverseLeftWords2(String s, int n){
        return s.substring(n, s.length()) + s.substring(0, n);
    }
}
