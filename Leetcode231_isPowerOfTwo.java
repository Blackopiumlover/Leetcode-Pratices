public class Leetcode231_isPowerOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(218));
    }

    public static boolean isPowerOfTwo(int n){
        if(n <= 0){
            return false;
        }
        if(n < 3){
            return true;
        }
        if(n % 2 != 0){
            return false;
        }
        
        while(n > 2){
            n = n / 2;
            if(n % 2 != 0){
                return false;
            }
        }
        return true;
    }
    
}
