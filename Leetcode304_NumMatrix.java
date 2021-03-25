public class Leetcode304_NumMatrix {

    // 暴力破解法：
    // int[][] matrix;
    // public Leetcode304_NumMatrix(int[][] matrix){
    //     this.matrix = matrix;
    // }
    // public int sumRegion(int row1, int col1, int row2, int col2) {
    //     int sum = 0;
    //     for(int i = row1; i <= row2; i++){
    //         for(int j = col1; j <= col2; j++){
    //             sum = sum + matrix[i][j];
    //         }
    //     }
    //     return sum;
    // }

    // 二维前缀和
    int[][] matrix;
    int[][] sums;
    public Leetcode304_NumMatrix(int[][] matrix){
        this.matrix = matrix;
        if(matrix.length > 0){
            sums = new int[matrix.length + 1][matrix[0].length + 1];
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                    sums[i + 1][j + 1] = sums[i][j + 1] + sums[i + 1][j] - sums[i][j] + matrix[i][j];
                }
            }
        }
    }
    public int sumRegin(int row1, int col1, int row2, int col2){
        return sums[row2 + 1][col2 + 1] - sums[row2 + 1][col1] - sums[row1][col2 + 1] + sums[row1][col1];
    }
}
