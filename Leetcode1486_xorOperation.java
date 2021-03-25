public class Leetcode1486_xorOperation{
    public static void main(String[] args) {
        System.out.println(xorOperation(5, 0));
    }

    public static int xorOperation(int n, int start){
        int ans = 0;
        int i = 0;
        while(i < n){
            int num = start + 2 * i;
            i = i + 1;
            ans = ans ^ num;
        }
        return ans;
    }
}