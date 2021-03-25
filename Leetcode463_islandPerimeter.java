public class Leetcode463_islandPerimeter {

    public static void main(String[] args) {
        int[][] grid = new int[][]{
            new int[]{1,0},
            // new int[]{1,1,1,0},
            // new int[]{0,1,0,0},
            // new int[]{1,1,0,0}
        };
        System.out.println(islandPerimeter(grid));
    }
    public static int islandPerimeter(int[][] grid){
        int[][] dp = new int[grid.length][grid[0].length];
        int perimeter = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0){
                    dp[i][j] = 0;
                }
                else{
                    int count = 0;
                    if(j + 1 < grid[0].length && grid[i][j + 1] == 1){
                        count++;
                    }
                    if(j - 1 >= 0 && grid[i][j - 1] == 1){
                        count++;
                    }
                    if(i + 1 < grid.length && grid[i + 1][j] == 1){
                        count++;
                    }
                    if(i - 1 >= 0 && grid[i - 1][j] == 1){
                        count++;
                    }

                    if(count == 0){
                        dp[i][j] = 4;
                    }

                    if(count == 1){
                        dp[i][j] = 3;
                    }
                    if(count == 2){
                        dp[i][j] = 2;
                    }
                    if(count == 3){
                        dp[i][j] = 1;
                    }
                    if(count == 4){
                        dp[i][j] = 0;
                    }
                }
                perimeter += dp[i][j];
            }    
        }
        return perimeter;
    }
    
}
