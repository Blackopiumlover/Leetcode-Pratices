public class Leetcode1313_decompressRLElist {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,3};
        int[] ans = decompressRLElist(nums);
        for(int i : ans){
            System.out.println(i);
        }
    }

    public static int[] decompressRLElist(int[] nums){
        int len = 0;
        for(int i = 0; i < nums.length; i += 2){
            len = len + nums[i];
        }
        int[] ans = new int[len];
        int index = 0;
        for(int i = 0; i < nums.length - 1; i++){
            int j = 0;
            while(j < nums[i]){
                ans[index] = nums[i + 1];
                index++;
                j++;
            }
            i++;
        }
        return ans;
    }
    
}
