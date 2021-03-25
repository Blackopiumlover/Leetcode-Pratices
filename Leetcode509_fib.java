public class Leetcode509_fib {

    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
    }

    // 注意，斐波那契数列使用暴力递归的复杂度是 2 的 n 次方，如果用例范围较大，一定会超时
    // 因为递归时每一次都会保存前两项
    public static int fib(int n){
        if(n < 2){
            return n;
        }
        int former = 0;
        int latter = 0;
        int sum = 1;
        for(int i = 2; i <= n; i++){
            former = latter;
            latter = sum;
            sum = former + latter;
        }
        return sum;
    }
    
}
