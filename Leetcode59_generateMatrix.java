public class Leetcode59_generateMatrix {

    public static void main(String[] args) {
        int[][] arr = generateMatrix(3);
        for(int[] a : arr){
            for(int i : a){
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n){
        int col = n;
        int row = n;
        int[][] matrix = new int[row][col];
        int numbers = 1;
        int left = 0;
        int right = col - 1;
        int top = 0;
        int bottom = row - 1;
        while(numbers <= n * n){
            for(int i = left; i <= right && numbers <= n * n; i++){
                matrix[top][i] = numbers++;
            }
            top++;

            for(int i = top; i <= bottom && numbers <= n * n; i++){
                matrix[i][right] = numbers++;
            }
            right--;

            for(int i = right; i >= left && numbers <= n * n; i--){
                matrix[bottom][i] = numbers++;
            }
            bottom--;

            for(int i = bottom; i >= top && numbers <= n * n; i--){
                matrix[i][left] = numbers++;
            }
            left++;
        }
        return matrix;
    }
}
