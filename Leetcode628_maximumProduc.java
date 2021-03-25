public class Leetcode628_maximumProduc {

    public static void main(String[] args) {
        int[] nums = new int[] { -1, -2, -3 };
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        int last = Integer.MAX_VALUE;
        int secLast = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] >= first) {
                third = second;
                second = first;
                first = nums[i];
            }
            if (nums[i] < first && nums[i] >= second) {
                third = second;
                second = nums[i];
            }
            if (nums[i] < second && nums[i] >= third) {
                third = nums[i];
            }

            if (nums[i] <= last) {
                secLast = last;
                last = nums[i];
            }
            if (nums[i] > last && nums[i] <= secLast) {
                secLast = nums[i];
            }

        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(last);
        System.out.println(secLast);
        return Math.max(first * second * third, last * secLast * first);
    }

}
