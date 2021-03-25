import java.util.ArrayList;
import java.util.List;

public class Leetcode228_summaryRanges {

    public static void main(String[] args) {
        int[] nums = new int[]{0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums){
        List<String> list = new ArrayList<String>();
        if(nums == null || nums.length == 0){
            return list;
        }
        if(nums.length == 1){
            list.add("\"" + nums[0] + "\"");
            return list;
        }
        StringBuilder sb = new StringBuilder();
        int left = 0;
        
        while(left < nums.length){
            int right = left + 1;
            while(right < nums.length && nums[right] == nums[right - 1] + 1){
                right = right + 1;
            }
            if(left == right - 1){
                sb.append("\"");
                sb.append(nums[left]);
                sb.append("\"");
                list.add(sb.toString());
                sb.delete(0, sb.capacity());
                left = right;
            }
            else{
                sb.append("\"");
                sb.append(nums[left]);
                sb.append("->");
                sb.append(nums[right - 1]);
                sb.append("\"");
                list.add(sb.toString());
                sb.delete(0, sb.capacity());
                left = right;
            }
        }
        return list;
    }
    
}
