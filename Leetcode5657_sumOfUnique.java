public class Leetcode5657_sumOfUnique {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums){
        int[] cnt = new int[101];
        for(int i = 0; i < nums.length; i++){
            cnt[nums[i]]++;
        }
        int sum = 0;
        for(int i = 0; i < cnt.length; i++){
            sum += cnt[i] == 1 ? i : 0;
        }
        return sum;
    }
    
}
