public class Leetcode1572_diagonalSum {

    public static void main(String[] args) {
        int[] l1 = new int[]{1,2,3};
        int[] l2 = new int[]{4,5,6};
        int[] l3 = new int[]{7,8,9};
        int[][] mat = new int[3][3];
        mat[0] = l1;
        mat[1] = l2;
        mat[2] = l3;
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat){
        int left = 0;
        int right = mat[0].length - 1;
        int sum = 0;
        int col = 0;
        while(col < mat.length){
            sum = sum + mat[col][left] + mat[col][right];
            if(left == right){
                sum = sum - mat[col][right];
            }
            left = left + 1;
            right = right - 1;
            col = col + 1;
        }
        return sum;
    }   
}
