public class Leetcode556_matrixReshape {

    public static void main(String[] args) {
        int[][] nums = new int[][]{new int[]{1,2,3,4}};
        int[][] ans = martixReshape(nums, 2, 2);
        for(int[] c : ans){
            for(int i : c){
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] martixReshape(int[][] nums, int r, int c){
            int m = nums.length;
            int n = nums[0].length;
            if(r * c != m * n){
                return nums;
            }
            int[][] ans = new int[r][c];
            for(int i = 0; i < m * n; i++){
                ans[i / c][i % c] = nums[i / n][i % n];
            }
            return ans;
    }
    
}
