public class Leetcode1480_runningSum {
    
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[] ans = runningSum(nums);
        for(int i : ans){
            System.out.println(i);
        }
    }
    // 1 2 3 4
    // 1 3 6 10
    public static int[] runningSum(int[] nums){
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for(int i = 1; i < ans.length; i++){
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;
    }
}
