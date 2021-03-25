public class JianZhi53_missingNumber {

    public static void main(String[] args) {
        int[] arr1 = new int[]{0,1};
        int[] arr2 = new int[]{0,1,2,3,4,5,6,7,9};
        int[] arr3 = new int[]{1,2,3,4,5};
        System.out.println(missingNumber2(arr1));
        System.out.println(missingNumber2(arr2));
        System.out.println(missingNumber2(arr3));
    }

    // 遍历
    public static int missingNumber1(int[] nums){
        if(nums.length == 1){
            if(nums[0] == 1){
                return 0;
            }
            return 1;
        }
        if(nums[0] != 0){
            return 0;
        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[0] + i){
                return nums[i] - 1;
            }
        }
        return nums[nums.length - 1] + 1;
    }

    // 有序数组一定要想到二分查找法
    public static int missingNumber2(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == mid){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    }
}
