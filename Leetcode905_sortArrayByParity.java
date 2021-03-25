public class Leetcode905_sortArrayByParity {

    public static void main(String[] args) {
        int[] A = {3,1,2,4};
        int[] arr = sortArrayByParity(A);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static int[] sortArrayByParity(int[] A){
        int left = 0;
        int right = A.length - 1;

        while(left < right){
            if(A[left] % 2 == 1){
                if(A[right] % 2 == 0){
                    int temp = A[left];
                    A[left] = A[right];
                    A[right] = temp;
                }
                else{
                    right--;
                    continue;
                }
            }
            else{
                left++;
                continue;
            }
        }
        return A;
    }
    
}
