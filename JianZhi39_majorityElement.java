// import java.util.HashMap;

public class JianZhi39_majorityElement {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,2,2,2,5,4,2};
        // int[] nums2 = new int[]{6,5,5};
        int count = majorityElement(nums1);
        System.out.println(count);
    }
    // 这道题有三种解法：
    // 解法一：
    // hashmap，统计每个数出现的次数，找到超过半数的
    // public static int majorityElement(int[] nums){
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for(int i : nums){
    //         if(!map.containsKey(i)){
    //             map.put(i, 1);
    //         }
    //         else{
    //             int count = map.get(i);
    //             map.replace(i, count + 1);
    //         }
    //     }
        
    //     for(int i : nums){
    //         if(map.get(i) > nums.length / 2){
    //             return i;
    //         }
    //     }
    //     return 0;
    // }

    // 解法二：
    // 将数组排序，中间数必定是超过半数的数
    // public static int majorityElement(int[] nums){
    //     for(int i = 0; i < nums.length; i++){
    //         for(int j = i + 1; j < nums.length; j++){
    //             if(nums[i] > nums[j]){
    //                 int temp = nums[i];
    //                 nums[i] = nums[j];
    //                 nums[j] = temp;
    //             }
    //         }
    //     }
    //     return nums[nums.length / 2];
    // }

    // 解法三：摩尔投票法：
    // 如果数组 nums 的多数为 x，数组长度为 n
    // 1. 若 x 的票数为 +1，非 x 的数的票数为 -1，则所有数字的票数和一定 > 0
    // 2. 如果前 a 个数字的票数和 = 0，则数组剩余 n - a 个数字的票数和一定还 > 0，也意味着后面 n - a 个数字的多数仍然是 x
    // 这样可以得出：如果前面 a 个数字的票数和为 0，那么前面的 a 个数字就都不用看了
    // x 仍然存在于后面的 n - a 个数字里，而且仍然是多数，这样就可以一次一次缩小区间
    // 最后的区间，即为 x
    // 以 [1,2,3,2,2,2,5,4,2] 为例：
    // 第一次循环，初始 votes = 0，所以假设 nums[0] = 1 为多数
    //            nums[0] = 1，是多数，所以 votes = votes + 1 = 1
    // 第二次循环，votes = 1 > 0，
    //            nums[1] = 2，不是多数，所以 votes = votes - 1 = 0
    // 此时区间缩小，多数仍存在于 [3,2,2,2,5,4,2] 中
    // 第三次循环，votes = 0，所以假设 nums[2] = 3 为多数
    //            num[2] = 3，是多数，所以 votes = votes + 1 = 1
    // 第四次循环，votes = 1 > 0，
    //            num[3] = 2，不是多数，所以 votes = votes - 1 = 0
    // 此时区间缩小，多数仍存在于 [2,2,5,4,2] 中
    // 第五次循环，votes = 0，所以假设 nums[4] = 2 为多数
    //            nums[4] = 2，是多数，所以 votes = votes + 1 = 1
    // 第六次循环，votes = 1 > 0，
    //            nums[5] = 2，是多数，所以 votes = votes + 1 = 2
    // 第七次循环，votes = 2 > 0，
    //            nums[6] = 5，不是多数，所以 votes = votes - 1 = 1
    // 第八次循环，votes = 1 > 0，
    //            nums[7] = 4，不是多数，所以 votes = votes - 1 = 0
    // 此时区间缩小，多数在 [2] 中
    // 假设多数为 2，循环结束，则多数就是 2
    public static int majorityElement(int[] nums){
        int x = 0;
        int votes = 0;
        for(int i = 0; i < nums.length; i++){
            // 这里第一次 i = 0，所以假设第一个数为多数
            if(votes == 0){
                x = nums[i];
            }
            // 如果这个数是多数，那么选票 + 1，如果不是多数，选票 - 1
            votes = votes + (nums[i] == x ? 1 : -1);
        }
        return x;
    }
    
}
