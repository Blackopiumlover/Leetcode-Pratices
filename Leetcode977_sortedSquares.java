public class Leetcode977_sortedSquares {
    // 时间复杂度为 O(n)
    public static void main(String[] args) {
        // int[] nums = new int[]{-4,-1,0,3,10};
        int[] nums = new int[]{-7,-3,2,3,11};
        int[] sorted = sortedSquares(nums);
        for(int i : sorted){
            System.out.println(i);
        }
    }

    public static int[] sortedSquares(int[] nums){
        int[] arr = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int end = arr.length - 1;
        for(int i = 0; i < arr.length; i++){
            if(0 - nums[left] > nums[right]){
                arr[end] = nums[left] * nums[left];
                left = left + 1;
                end = end - 1;
            }
            else{
                arr[end] = nums[right] * nums[right];
                right = right - 1;
                end = end - 1;
            }
        }
        return arr;
    }
    
}
