public class Leetcode344_reverseString {

    public static void main(String[] args) {
        char[] s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        System.out.println(String.valueOf(s));
        reverseString(s);
        System.out.println(String.valueOf(s));
    }

    public static void reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;
        while(left < right){
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
    }
    
}
