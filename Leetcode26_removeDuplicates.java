public class Leetcode26_removeDuplicates {

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);
        for(int i = 0; i < len; i++){
            System.out.print(nums[i] + " ");
        }

    }
    // 快慢指针
    public static int removeDuplicates(int[] nums){
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    
}
