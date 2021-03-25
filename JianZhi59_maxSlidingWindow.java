public class JianZhi59_maxSlidingWindow {

    public static void main(String[] args){
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int[] ans = maxSlidingWindow(nums, 3);
        for(int i : ans){
            System.out.println(i);
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k){
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        int i = 0;
        int[] ans = new int[nums.length - k + 1];
        for(int j = 0; j < nums.length - k + 1; j++){
            int max = nums[j];
            for(int p = j; p < j + k; p++){
                // System.out.print(nums[p] + "\t");                
                if(nums[p] > max){
                    max = nums[p];
                }
            }
            // System.out.println();
            ans[i] = max;
            i++;
        }
        return ans;
    }   
}
