public class Leetcode73_setZeros {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };
        setZeros(matrix);

        for(int[] arr : matrix){
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void setZeros(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        boolean rowHas0 = false;
        boolean colHas0 = false;
        for(int i = 0; i < col; i++){
            if(matrix[0][i] == 0){
                colHas0 = true;
            }
        }

        for(int i = 0; i < row; i++){
            if(matrix[i][0] == 0){
                rowHas0 = true;
            }
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(rowHas0){
            for(int i = 0; i < row; i++){
                matrix[i][0] = 0;
            }
        }

        if(colHas0){
            for(int i = 0; i < col; i++){
                matrix[0][i] = 0;
            }
        }
    }
    
}
