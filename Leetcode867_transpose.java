public class Leetcode867_transpose {

    public static void main(String[] args) {
        int[][] A = new int[2][3];
        // A[0] = new int[]{1,2,3};
        // A[1] = new int[]{4,5,6};
        // A[2] = new int[]{7,8,9};
        A[0] = new int[]{1,2,3};
        A[1] = new int[]{4,5,6};
        int[][] transA = transpose(A);
        for(int[] a : transA){
            for(int b : a){
                System.out.print(b);
            }
            System.out.println();
        }
            
    }

    public static int[][] transpose(int[][] A){
        int a = A.length;
        int b = A[0].length;
        int[][] transA = new int[b][a];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                transA[j][i] = A[i][j];
            }
        }
        return transA;
    }
    
}
