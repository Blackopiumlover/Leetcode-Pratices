public class Leetcode832_flipAndInvertImage {

    public int[][] flipAndInvertImage(int[][] A){
        for(int i = 0; i < A.length; i++){
            int left = 0;
            int right = A[0].length - 1;
            while(left < right){
                int temp = A[i][left] == 1? 0 : 1;
                A[i][left] = A[i][right] == 1? 0 : 1;
                A[i][right] = temp;
                left = left + 1;
                right = right - 1;
            }
            if(left == right){
                A[i][left] = A[i][right] == 1? 0 : 1;
            }
        }
        return A;
    }
    
}
