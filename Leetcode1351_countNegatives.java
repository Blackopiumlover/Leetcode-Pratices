public class Leetcode1351_countNegatives {

    public static void main(String[] args) {
        int[][] grid = new int[][]{
            new int[]{4,3,2,-1},
            new int[]{3,2,1,-1},
            new int[]{1,1,-1,-2},
            new int[]{-1,-1,-2,-3}
        };
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int i = 0;
        int j = n - 1;
        int count = 0;
        while(i < m && j >= 0){
            if(grid[i][j] < 0){
                count = count + (m - i);
                j = j - 1;
            }
            else{
                i = i + 1;
            }
        }
        return count;
    }
    
}
