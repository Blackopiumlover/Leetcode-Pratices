public class Leetcode1365_smallerNumbersThanCurrent {

    public static void main(String[] args) {
        int[] nums = new int[]{8,1,2,2,3};
        // int[] ans = smallerNumbersThanCurrent(nums);
        int[] ans = anotherMethod(nums);
        for(int num : ans){
            System.out.println(num);
        }
    }
    // 暴力法
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    count = count + 1;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    // 桶法，统计每个元素的个数
    // 8 1 2 2 3
    // 创建数组 0 0 0 0 0 0 0 0 0 0 0
    // cnt[nums[i]]++ ----------> 0 0 0 0 0 0 0 0 1 0
    //                            0 1 0 0 0 0 0 0 1 0
    //                            0 1 1 0 0 0 0 0 1 0
    //                            0 1 2 0 0 0 0 0 1 0
    //                            0 1 2 1 0 0 0 0 1 0
    //        比当前数字小的个数：0 0 1 3 4 4 4 4 4 4（错位）
    //                     index: 0 1 2 3 4 5 6 7 8 9
    // < 8 --> 0 + 1 + 2 + 1 + 0 + 0 + 0 + 0 = 4
    // < 1 --> 0
    // < 2 --> 0 + 1 = 1
    // < 3 --> 0 + 1 + 2 = 3
    public static int[] anotherMethod(int[] nums){
        int[] cnt = new int[101];
        for(int i = 0; i < nums.length; i++){
            cnt[nums[i]] = cnt[nums[i]] + 1;
        }
        for(int j = 1; j < cnt.length; j++){
            cnt[j] = cnt[j] + cnt[j - 1];
        }
        int[] ans = new int[nums.length];
        for(int k = 0; k < ans.length; k++){
            if(nums[k] == 0){
                ans[k] = 0;
            }
            else{
                ans[k] = cnt[nums[k] - 1];
            }
        }
        return ans;
    }
    
}
