public class Leetcode1688_numberOfMatches {

    public static void main(String[] args) {
        System.out.println(numberOfMatches(14));
    }

    public static int numberOfMatches(int n){
        int count = 0;
        while(n != 1){
            if(n % 2 == 1){
                count = count + (n - 1) / 2;
                n = (n - 1) / 2 + 1;
                continue;
            }
            if(n % 2 == 0){
                count = count + n / 2;
                n = n / 2;
                continue;
            }
        }
        return count;
    }
    
}
