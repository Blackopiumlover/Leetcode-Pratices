import java.util.ArrayList;
import java.util.List;

public class Leetcode1380_luckyNumbers {

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < matrix.length; i++){
            int min = matrix[i][0];
            int minIndex = 0;
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    minIndex = j;
                }
            }

            boolean isMax = true;
            for(int k = 0; k < matrix.length; k++){
                if(matrix[k][minIndex] > min){
                    isMax = false;
                }
            }

            if(isMax){
                list.add(min);
            }
        }
        return list;
    }
    
}
