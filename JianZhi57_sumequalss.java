public class JianZhi57_sumequalss {

    public static void main(String[] args){
        int[] ans = twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

    public static int[] twoSum(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum < target) {
                left = left + 1;
            }
            if(sum > target) {
                right = right - 1;
            }
            if(sum == target) {
                return new int[]{nums[left], nums[right]};
            }
        }
        return null;
    }
}