import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Leetcode503_nextGreaterElements {

    public static void main(String[] args) {
        int[] nums = new int[]{9,1,2,1,4,21,3,4};
        for(int i : nextGreater(nums)){
            System.out.print(i + " ");
        }
    }

    // 暴力破解法：将数组复制扩容，找到每个元素右边比它大的元素，双循环
    public static int[] nextGreaterElements(int[] nums){
        int[] ans = new int[nums.length];
        int[] expand = new int[nums.length * 2];
        for(int i = 0; i < nums.length; i++){
            expand[i] = nums[i];
            expand[i + nums.length] = nums[i];
        }
        
        for(int i = 0; i < nums.length; i++){
            boolean hasGreater = false;
            int index = i;
            while(index < expand.length){
                if(expand[index] > nums[i]){
                    hasGreater = true;
                    ans[i] = expand[index];
                    break;
                }
                index++;
            }
            if(!hasGreater){
                ans[i] = -1;
            }
        }
        return ans;
    }
    
    // 单调栈
    public static int[] nextGreater(int[] nums){
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        Deque<Integer> stack = new LinkedList<Integer>();
        for(int i = 0; i < 2 * nums.length - 1; i++){
            while(!stack.isEmpty()){
                if(nums[stack.peek()] < nums[i % nums.length]){
                    res[stack.pop()] = nums[i % nums.length];
                }
                else{
                    break;
                }
            }
            stack.push(i % nums.length);
        }
        return res;
    }

}
