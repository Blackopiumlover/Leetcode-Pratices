import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Leetcode349_intersection {

    public int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> set1 = new HashSet<Integer>();
        for(int i : nums1){
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<Integer>();
        for(int i : nums2){
            set2.add(i);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i : set1){
            if(!set2.add(i)){
                list.add(i);
            }
        }
        int[] nums = new int[list.size()];
        for(int i = 0; i < nums.length; i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}
