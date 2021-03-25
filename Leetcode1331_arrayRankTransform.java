import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode1331_arrayRankTransform {

    public static void main(String[] args) {
        int[] arr = new int[]{37,12,28,9,100,56,80,5,12};
        int[] ans = arrayRankTranform(arr);
        for(int i : ans){
            System.out.print(i + " ");
        }
    }

    public static int[] arrayRankTranform(int[] arr){
        int[] nums = arr.clone();
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int index = 0;
        int pos = 1;
        while(index < arr.length){
            if(!map.containsKey(arr[index])){
                map.put(arr[index], pos);
                index++;
                pos++;
            }
            else{
                index++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
    
}
