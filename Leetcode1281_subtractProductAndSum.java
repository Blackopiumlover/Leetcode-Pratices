public class Leetcode1281_subtractProductAndSum {

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(anotherMethod(234));
    }

    public static int subtractProductAndSum(int n){
        String s = n + "";
        int product = 1;
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int num = Integer.valueOf(s.charAt(i) + "");
            product = product * num;
            sum = sum + num;
        }
        return product - sum;
    }
    
    public static int anotherMethod(int n){
        int sum = 0;
        int product = 1;
        while(n != 0){
            sum = sum + n % 10;
            product = product * (n % 10);
            n = n / 10;
        }
        return product - sum;
    }
}
