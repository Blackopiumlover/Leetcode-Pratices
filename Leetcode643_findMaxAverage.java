public class Leetcode643_findMaxAverage {

    public static void main(String[] args) {
        int[] arr = new int[]{-1};
        System.out.println(findMaxAverage2(arr, 1));
        System.out.println((double)-1 / 1);
    }

    // 注意 double 类型的运算比 int 类型的运算所用的时间更多，如果都设为 double 类型，一定会超出时间限制
    public static double findMaxAverage1(int[] nums, int k){
        int left = 0;
        int right = k;
        int max = Integer.MIN_VALUE;
        while(right < nums.length + 1){
            int sum = 0;    
            for(int i = left; i < right; i++){
                sum = sum + nums[i];
            }
            if(sum > max){
                max = sum;
            }
            left = left + 1;
            right = right + 1;
        }
        return (double)max / k;
    }

    public static double findMaxAverage2(int[] nums, int k){
        int left = 0;
        int right = k - 1;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
        }
        int max = sum;
        right = right + 1;
        while(right < nums.length){
            int removed = nums[left];
            int added = nums[right];
            sum = sum - removed + added;
            if(sum > max){
                max = sum;
            }
            left = left + 1;
            right = right + 1;
        }
        return (double)max / k;
    }
    
}
