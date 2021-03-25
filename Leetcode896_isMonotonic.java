public class Leetcode896_isMonotonic {

    public static void main(String[] args) {
        int[] A = new int[]{};
        System.out.println(isMonotonic(A));
    }

    public static boolean isMonotonic(int[] A){
        boolean increase = true;
        boolean decrease = true;
        for(int i = 1; i < A.length; i++){
            if(A[i - 1] < A[i]){
                decrease = false;
            }
            if(A[i - 1] > A[i]){
                increase = false;
            }
        }
        return increase || decrease;
    }
    
}
