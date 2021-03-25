public class Leetcode414_thirdMax{

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,-2147483648,2};
        int[] nums2 = new int[]{1,2,-2147483648};
        int[] nums3 = new int[]{1,1,2};
        int[] nums4 = new int[]{-2147483648,1,1};
        System.out.println(thirdMax(nums1));
        System.out.println(thirdMax(nums2));
        System.out.println(thirdMax(nums3));
        System.out.println(thirdMax(nums4));
    }

    public static int thirdMax(int[] nums){
        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        int t = Integer.MIN_VALUE;
        int flag = 0;
        for(int i : nums){
            if(i == Integer.MIN_VALUE){
                flag = 1;
            }
            if(i > f){
                t = s;
                s = f;
                f = i;
                continue;
            }
            if(i < f && i > s){
                t = s;
                s = i;
                continue;
            }
            if(i < s && i >= t){
                t = i;
            }
        }
        if(nums.length == 1){
            return f;
        }
        if(nums.length == 2){
            return f;
        }
        if(flag == 0 && t == Integer.MIN_VALUE){
            return f;
        }
        if(flag == 1 && t == Integer.MIN_VALUE && s == t){
            return f;
        }
        return t;
    }
}
