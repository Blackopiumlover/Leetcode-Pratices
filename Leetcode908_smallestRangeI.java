import java.util.Arrays;

public class Leetcode908_smallestRangeI {

    public static void main(String[] args) {
        System.out.println(smallestRangeI(new int[]{1,3,6}, 3));
    }

    public static int smallestRangeI(int[] A, int K){
        Arrays.sort(A);
        if(A[0] + K >= A[A.length - 1] - K){
            return 0;
        }
        return A[A.length - 1] - K - (A[0] + K);
    }
    
}
