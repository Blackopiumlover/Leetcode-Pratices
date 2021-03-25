public class Leetcode283_moveZeros {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeros(nums);
        for(int i : nums){
            System.out.print(i + " ");
        }
    }

    public static void moveZeros(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                continue;
            }
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == 0){
                    continue;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                break;
            }
        }
    }
    
}
