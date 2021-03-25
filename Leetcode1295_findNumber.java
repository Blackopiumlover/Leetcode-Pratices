public class Leetcode1295_findNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{12,345,2,6,7896};
        System.out.println(findNumbers1(nums));
    }
    public static int findNumbers1(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            String s = nums[i] + "";
            if(s.length() % 2 == 0){
                count = count + 1;
            }
        }
        return count;
    }

    public static int findNumbers2(int[] nums) {
        int ans = 0;
        for(int val : nums) {
            if((helper(val) & 1) == 0) {
                ans++;
            }
        }
        return ans;
    }

    private static int helper(int val) {
        if(val < 10) return 1;
        int ans = 0;
        while(val > 0) {
            ans++;
            val /= 10;
        }
        return ans;
    }
    
}
