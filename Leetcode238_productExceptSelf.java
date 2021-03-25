public class Leetcode238_productExceptSelf {

    // 元素左边的元素乘积 * 元素右边的元素乘积
    public int[] productExceptSelf(int[] nums){
        int[] left = new int[nums.length];
        left[0] = 1;
        for(int i = 1; i < left.length; i++){
            left[i] = left[i - 1] * nums[i - 1];
        }
        int[] right = new int[nums.length];
        right[right.length - 1] = 1;
        for(int i = right.length - 2; i >= 0; i--){
            right[i] = right[i + 1] * nums[i + 1];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = left[i] * right[i];
        }
        return nums;
    }
    
    // 空间优化
    public int[] better(int[] nums){
        int[] ans = new int[nums.length];
        int left = 1;
        ans[0] = left;
        for(int i = 1; i < ans.length; i++){
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int right = 1;
        for(int i = ans.length - 2; i >= 0; i--){
            ans[i] = ans[i + 1] * right;
            right = nums[i + 1];
        }
        return ans;
    }
}
