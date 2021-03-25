public class Leetcode191_hammingWeight {
    
    public static int hammingWeight(int n){
        int count = 0;
        while(n != 0){
            int result = n & 1;
            if(result == 1){
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }
    
}
