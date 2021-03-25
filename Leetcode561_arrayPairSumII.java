import java.util.Arrays;

public class Leetcode561_arrayPairSumII{

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            i++;
        }
        return sum;
    }
}

