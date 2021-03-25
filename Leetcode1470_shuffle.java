public class Leetcode1470_shuffle {

    public static void main(String[] args) {
        // int[] nums = new int[]{2,5,1,3,4,7};
        // int[] nums = new int[]{1,2,3,4,4,3,2,1};
        int[] nums = new int[]{1,1,2,2};
        for(int i : shuffle(nums, 2)){
            System.out.println(i);
        }
    }

    public static int[] shuffle(int[] nums, int n){
        int[] ans = new int[nums.length];
        for(int i = 0; i < n; i++){
            ans[2 * i] = nums[i];    
        }
        int count = 0;
        for(int j = nums.length - 1; j >= n; j--){
            ans[j - count] = nums[j];
            count++;
        }
        return ans;
    }
    
}
