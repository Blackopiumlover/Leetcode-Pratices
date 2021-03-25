import java.util.ArrayList;
import java.util.List;

public class Leetcode54_spiralOrder {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        List<Integer> list = spiralOrder(matrix);
        System.out.println(list);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> order = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return order;
        }
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int numEle = matrix[0].length * matrix.length;

        while(numEle >= 1){
            for(int i = left; i <= right && numEle >= 1; i++){
                order.add(matrix[top][i]);
                numEle--;
            }
            top++;
            for(int i = top; i <= bottom && numEle >= 1; i++){
                order.add(matrix[i][right]);
                numEle--;
            }
            right--;
            for(int i = right; i >= left && numEle >= 1; i--){
                order.add(matrix[bottom][i]);
                numEle--;
            }
            bottom--;
            for(int i = bottom; i >= top && numEle >= 1; i--){
                order.add(matrix[i][left]);
                numEle--;
            }
            left++;
        }
        return order;
    }    
    
}
