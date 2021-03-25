import java.util.ArrayList;
import java.util.List;

public class Leetcode448_findDisappearedNumbers {

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,7,8,2,3,1};
        System.out.println(findDisapearedNumbers(arr));
    }

    public static List<Integer> findDisapearedNumbers(int[] nums){
        int[] cnt = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            cnt[nums[i]]++;
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i < cnt.length; i++){
            if(cnt[i] == 0){
                list.add(i);
            }
        }
        return list;
    }
    
}
