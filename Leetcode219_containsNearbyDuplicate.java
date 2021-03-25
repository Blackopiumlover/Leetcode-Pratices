import java.util.HashMap;

public class Leetcode219_containsNearbyDuplicate {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1,2,3};
        System.out.println(containsNearybyDuplicate(nums, 2));
    }

    // 暴力破解法：
    public static boolean containsNearybyDuplicate(int[] nums, int k){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j] && j - i <= k){
                    return true;
                }
            }
        }
        return false;
    }

    // HashMap 法：
    public static boolean anotherMethod(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            Integer index = map.get(nums[i]);
            if(index == null){
                map.put(nums[i], i);
            }
            else if(i - index <= k){
                return true;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return false;
    }
    
}
