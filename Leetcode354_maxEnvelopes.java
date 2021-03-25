import java.util.Arrays;
import java.util.Comparator;

public class Leetcode354_maxEnvelopes {

    public int maxEnvelopes(int[][] envelopes){
        if(envelopes.length == 0){
            return 0;
        }
        Arrays.sort(envelopes, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0] != b[0]){
                    return a[0] - b[0];
                }
                else{
                    return b[1] - a[1];
                }
            }
        });

        int[] height = new int[envelopes.length];
        for(int i = 0; i < envelopes.length; i++){
            height[i] = envelopes[i][1];
        }

        return lengthOfLIS(height);
    }

    public int lengthOfLIS(int[] nums){
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int res = 1;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }        
        return res;
    }
    
}
