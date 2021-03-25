public class Leetcode1512_numIdenticalParis {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
        System.out.println(anotherMethod(nums));
    }

    // 暴力破解法：
    // 1ms 82.01%
    // 35.8MB 54.71%
    public static int numIdenticalPairs(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count += 1;
                }
            }
        }
        return count;
    }
    
    // 桶计数 + 数学公式
    // 1 1 1 1 ----> 6 = 4 * 3 / 2
    // n 个相同的数字，组成相同对的个数是 n * (n - 1) / 2
    // 利用桶来计数
    // 0ms 100%
    // 36.1MB 7.08%
    public static int anotherMethod(int[] nums){
        int[] arr = new int[101];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                continue;
            }
            count = count + arr[i] * (arr[i] - 1) / 2;
        }
        return count;
    }
}
