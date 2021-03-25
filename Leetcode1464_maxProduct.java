public class Leetcode1464_maxProduct {

    public static void main(String[] args) {
        int[] nums = new int[]{3,7};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums){
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int k = 0; k < nums.length; k++){
            if(nums[k] > max){
                max = nums[k];
                i = k;
            }
        }
        for(int k = 0; k < nums.length; k++){
            if(nums[k] > secMax && nums[k] <= max && k != i){
                secMax = nums[k];
                j = k;
            }
        }
        return (nums[i] - 1) * (nums[j] - 1);
    }
}
