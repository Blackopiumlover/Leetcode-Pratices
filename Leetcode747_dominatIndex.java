public class Leetcode747_dominatIndex {

    public static void main(String[] args) {
        int[] nums = new int[]{0,2,3,0};
        int t = dominatIndex(nums);
        System.out.println(t);
    }

    public static int dominatIndex(int[] nums){
        if(nums.length == 1){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                sec = max;
                max = nums[i];
                index = i;
                continue;
            }
            if(nums[i] <= max && nums[i] > sec){
                sec = nums[i];
            }
        }
        if(sec == 0 && max > 0){
            System.out.println(max);
            System.out.println(sec);
            return index;
        }
        System.out.println(max);
        System.out.println(sec);
        return max / sec >= 2 ? index : -1;
    }
    
}
