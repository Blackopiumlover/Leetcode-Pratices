public class JianZhi632_lastRemaining {

    public static void main(String[] args) {
        System.out.println(lastRemaining(5, 3));
    }
    public static int lastRemaining(int n, int m){
        return f(n, m);
    }
    public static int f(int n, int m){
        if(n == 1){
            return 0;
        }
        return (f(n - 1, m) + m) % n;
    }
}
