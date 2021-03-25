import java.util.Arrays;

public class Leetcode1502_canMakeArithmeticProgression {

    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(canMakeArithmeticProgression(arr));
    }

    public static boolean canMakeArithmeticProgression(int[] arr){
        if(arr.length == 2){
            return true;
        }

        Arrays.sort(arr);

        boolean[] dp = new boolean[arr.length];
        dp[0] = true;

        int gap = arr[1] - arr[0];
        for(int i = 1; i < dp.length; i++){
            if(dp[i - 1] == false){
                dp[i] = false;
            }
            else{
                dp[i] = arr[i] - arr[i - 1] == gap;
            }
        }

        return dp[dp.length - 1];
    }
    
}
