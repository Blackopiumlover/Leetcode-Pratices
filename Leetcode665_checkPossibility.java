public class Leetcode665_checkPossibility {

    public static void main(String[] args) {
        int[] nums = new int[]{3,4,2,3};
        System.out.println(checkPossibility(nums));
    }

    public static boolean checkPossibility(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                count += 1;
                if(count > 1){
                    return false;
                }
                if(i > 0 && nums[i + 1] < nums[i - 1]){
                    nums[i + 1] = nums[i];
                }
            }
        }
        return true;
    }
    
}
