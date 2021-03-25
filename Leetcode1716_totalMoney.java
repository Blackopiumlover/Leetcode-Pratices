public class Leetcode1716_totalMoney {

    public static void main(String[] args) {
        System.out.println(totalMoney(4));
        System.out.println(totalMoney(10));
        System.out.println(totalMoney(20));
        System.out.println(totalMoney(30));
        System.out.println(totalMoney(40));
    }

    public static int totalMoney(int n){
        int a = n % 7;
        int b = n / 7;
        int total = 0;
        if(b == 0){
            for(int i = 1; i <= a; i++){
                total += i;
            }
        }
        else{
            total = b * (1 + 2 + 3 + 4 + 5 + 6 + 7) + (b * (b - 1) / 2) * 7;
            for(int i = 1; i <= a; i++){
                total += i + b;
            }
        }
        return total;
    }
    
}
