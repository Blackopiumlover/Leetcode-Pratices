public class Leetcode922_sortArrayByParityII {

    public static void main(String[] args) {
        int[] A = new int[]{4,2,5,7};
        int[] B = sortArrayByParityII(A);
        for(int i : B){
            System.out.print(i + " ");
        }
    }

    // 多次遍历暴力解法，超时
    public static int[] sortArrayByParityII(int[] A){
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 1 && i % 2 == 0){
                for(int j = 0; j < A.length; j++){
                    if(A[j] % 2 == 0 && j % 2 == 1){
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                    }
                }
            }
        }
        return A;
    }

    // 新建数组，重新赋值
    public static int[] sort1(int[] A){
        int[] newA = new int[A.length];
        int index = 0;
        for(int i : A){
            if(i % 2 == 0){
                newA[index] = i;
                index += 2;
            }
        }
        index = 1;
        for(int i : A){
            if(i % 2 == 1){
                newA[index] = i;
                index += 2;
            }
        }
        return newA;
    }

    // 双指针修改原数组
    public static int[] sort2(int[] A){
        int j = 1;
        for(int i = 0; i < A.length; i += 2){
            if(A[i] % 2 == 1){
                while(A[j] % 2 != 0){
                    j += 2;
                }
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }
    
}
