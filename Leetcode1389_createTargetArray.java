import java.util.ArrayList;

public class Leetcode1389_createTargetArray {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,3,4};
        int[] index = new int[]{0,1,2,2,1};
        for(int i : createTargetArray(nums, index)){
            System.out.println(i);
        }
    }

    public static int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    
}
