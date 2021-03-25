public class JianZhi61_isStraight {
    
    public static void main(String[] args){
        int[] nums1 = new int[]{1,2,3,4,5};
        int[] nums2 = new int[]{0,0,1,2,5};
        System.out.println(isStraight(nums1));
        System.out.println(isStraight(nums2));
    }

    public static boolean isStraight(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int zeroNum = 0;
        int diff = 0;
        for(int k = 0; k < nums.length - 1; k++){
            if(nums[k] == 0){
                zeroNum = zeroNum + 1;
            }
            else{
                if(nums[k] == nums[k + 1]){
                    return false;
                }
                diff = diff + nums[k + 1] - (nums[k] + 1);
            }
        }
        return zeroNum >= diff;
    }
    
}
