import java.util.PriorityQueue;

public class Leetcode703_KthLargest {

    private int k;
    // private int[] nums;
    private PriorityQueue<Integer> pq;

    public static void main(String[] args) {
        Leetcode703_KthLargest KthLargest = new Leetcode703_KthLargest(1, new int[]{});
        System.out.println(KthLargest.add(-3));
        System.out.println(KthLargest.add(-2));
        System.out.println(KthLargest.add(-4));
        System.out.println(KthLargest.add(0));
        System.out.println(KthLargest.add(4));
    }

    // 注释部分为暴力破解法：
    // 非注释部分为最小堆法：
    public Leetcode703_KthLargest(int k, int[] nums) {
        this.k = k;
        // this.nums = nums;
        // 先给数组排序：
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(nums[i] < nums[j]){
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }
        pq = new PriorityQueue<Integer>();
        for(int i : nums){
            add(i);
        }
    }
    
    public int add(int val){

        if(pq.isEmpty()){
            pq.offer(val);
            return val;
        }
        pq.offer(val);
        if(pq.size() > k){
            pq.poll();
        }
        return pq.peek();

        // if(nums == null || nums.length == 0){
        //     int[] arr = new int[1];
        //     arr[0] = val;
        //     this.nums = arr;
        //     return val;
        // }
        // int[] arr = new int[nums.length + 1];
        // int flag = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] >= val){
        //         arr[i] = nums[i];
        //     }
        //     else{
        //         arr[i] = val;
        //         flag = i + 1;
        //         break;
        //     }
        // }
        // if(flag == 0){
        //     arr[nums.length] = val;
        // }
        // else{
        //     for(int i = flag; i < arr.length; i++){
        //         arr[i] = nums[i - 1];
        //     }
        // }
        // this.nums = arr;
        // return arr[k - 1];
    }
}
