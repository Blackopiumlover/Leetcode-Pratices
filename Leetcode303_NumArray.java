public class Leetcode303_NumArray {

    int[] NumArray;
    int[] sum;

    // 暴力破解法：
    // public Leetcode303_NumArray(int[] nums){
    //     NumArray = nums;
    // }
    // public int sumRange(int i, int j) {
    //     int sum = 0;
    //     while(i <= j){
    //         sum = sum + NumArray[i];
    //         i += 1;
    //     }
    //     return sum;
    // }

    // 前缀和动态规划
    public Leetcode303_NumArray(int[] nums){
        NumArray = nums;
        sum = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j){
        return sum[j + 1] - sum[i];
    }
}
