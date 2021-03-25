public class Leetcode88_merge {

    public static void main(String[] args) {
        int[] nums1 = new int[]{2,0};
        int[] nums2 = new int[]{1};
        merge(nums1, 1, nums2, 1);
        for(int i : nums1){
            System.out.println(i);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int[] nums = nums1.clone();
        int i = 0;
        int j = 0;
        int k = 0;
        if(nums2 == null || nums2.length == 0){
            return ;
        }
        while(i < m){
            if(j >= n){
                while(i < m){
                    nums1[k] = nums[i];
                    i++;
                    k++;
                }
                break;
            }

            if(nums[i] < nums2[j]){
                nums1[k] = nums[i];
                i++;
                k++;
            }
            else{
                nums1[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(j < n){
            nums1[k] = nums2[j];
            k++;
            j++;
        }
    }
    
}
