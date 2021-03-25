public class JianZhi53_search {
    
    public static void main(String[] args){
        int[] nums = new int[]{5,7,7,8,8,10};
        System.out.println(search(nums, 6));
    }

    public static int search(int[] nums, int target){
        int count = 0;
        int i = 0;
        while(i < nums.length){
            if(target == nums[i]){
                count = count + 1;
            }
            i = i + 1;
        }
        return count;
    }
}
