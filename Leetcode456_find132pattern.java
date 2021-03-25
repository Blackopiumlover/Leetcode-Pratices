import java.util.Stack;

public class Leetcode456_find132pattern {

    public static void main(String[] args) {
        int[] nums = {1,3,2,4,5,6,7,8,9,10};
        System.out.println(find132pattern(nums));
    }

    public static boolean find132pattern(int[] nums){

        // 动态规划超时
        // boolean[][] dp = new boolean[nums.length][nums.length];
        // for(int i = dp.length - 1; i >= 0; i--){
        //     for(int j = 2; j < dp[0].length; j++){
        //         if(j - i < 2){
        //             dp[i][j] = false;
        //             continue;
        //         }
        //         if(dp[i][j - 1] == true || dp[i + 1][j] == true){
        //             dp[i][j] = true;
        //         }
        //         else{                   
        //             int lessIndex = -1;
        //             for(int k = 0; k < j; k++){
        //                 if(nums[k] < nums[j]){
        //                     lessIndex = k;
        //                     break;
        //                 }
        //             }

        //             if(lessIndex < 0){
        //                 dp[i][j] = false;
        //             }
        //             else{
        //                 for(int k = lessIndex + 1; k < j; k++){
        //                     if(nums[k] > nums[j]){
        //                         dp[i][j] = true;
        //                     }
        //                 }
        //             }
        //         }
        //     }
        // }

        // for(boolean[] s : dp){
        //     for(boolean i : s){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }
        // return dp[0][nums.length - 1];
        
        // 单调栈找 3
        if(nums.length < 3){
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(nums[nums.length - 1]);

        int second = Integer.MIN_VALUE;

        for(int i = nums.length - 2; i >= 0; i--){

            if(nums[i] < second){
                return true;
            }

            // while(!stack.isEmpty()){
            //     if(stack.peek() < nums[i]){
            //         second = stack.pop();
            //         stack.push(nums[i]);
            //         break;
            //     }
            // }

            while(!stack.isEmpty() && stack.peek() < nums[i]){
                second = stack.pop();
                // stack.push(nums[i]);
            }
            if(nums[i] > second){
                stack.push((nums[i]));
            }

        }
        return false;
    }
    
}
