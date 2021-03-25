public class MianShiTi17_10_majorityElement {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums){
        int x = 0;
        int votes = 0;
        for(int i = 0; i < nums.length; i++){
            if(votes == 0){
                x = nums[i];
            }
            votes = votes + (nums[i] == x ? 1 : -1);
        }
        int count = 0;
        for(int i : nums){
            if(i == x){
                count++;
            }
        }
        if(count <= nums.length / 2){
            return -1;
        }
        return x;
    }
    
}
