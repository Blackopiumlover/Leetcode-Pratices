public class Leetcode27_removeElement {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int len = removeElement(nums, 3);
        System.out.println(len);
        for(int i = 0; i < len; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val){
        int count = 0;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            if(nums[left] != val){
                count++;
                left += 1;
            }
            else{
                nums[left] = nums[right];
                nums[right] = 0;
                right -= 1;
            }
        }
        return count;
    }
    
}
