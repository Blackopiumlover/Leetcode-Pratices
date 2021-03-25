public class Leetcode674_findLengthOfLCIS {

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,4,2,3,4,5};
        System.out.println(findLengthOfLCIS(nums));
    }

    public static int findLengthOfLCIS(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int count = 1;
        int max = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                count++;
            }
            else{    
                count = 1;
            }
            max = Math.max(max, count);
            // System.out.print(count + " ");
        }
        // System.out.println();
        return max;
    }
    
}
