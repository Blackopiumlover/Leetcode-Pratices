import java.util.HashMap;
import java.util.Map;

public class Leetcode1262_oddCells {

    public static void main(String[] args) {
        int[][] indices = new int[][]{new int[]{0,1}, new int[]{1,1}};
        System.out.println(anotherMethod(2, 3, indices));
    }

    public static int oddCells(int n, int m, int[][] indices){
        Map<Integer, Integer> mapRow = new HashMap<Integer, Integer>();
        Map<Integer, Integer> mapCol = new HashMap<Integer, Integer>();
        for(int i = 0; i < indices.length; i++){
            if(!mapRow.containsKey(indices[i][0])){
                mapRow.put(indices[i][0], 1);
            }
            else{
                mapRow.replace(indices[i][0], mapRow.get(indices[i][0]), mapRow.get(indices[i][0]) + 1);
            }
            if(!mapCol.containsKey(indices[i][1])){
                mapCol.put(indices[i][1], 1);
            }
            else{
                mapCol.replace(indices[i][1], mapCol.get(indices[i][1]), mapCol.get(indices[i][1]) + 1);    
            }
        }
        System.out.println(mapRow.toString());
        System.out.println(mapCol.toString());
        int row = 0;
        int col = 0;
        int count = 0;
        while(row < n){
            while(col < m){
                int i = mapRow.containsKey(row) ? mapRow.get(row) : 0;
                int j = mapCol.containsKey(col) ? mapCol.get(col) : 0;
                count = count + ((i + j) % 2 == 1 ? 1 : 0);
                col = col + 1;
                System.out.print(i + j + " ");
            }
            System.out.println();
            col = 0;
            row += 1;
        }
        return count;
    }

    public static int anotherMethod(int n, int m, int[][] indices){
        int[] rows = new int[n];
        int[] cols = new int[m];
        for(int i = 0; i < indices.length; i++){
            rows[indices[i][0]]++;
            cols[indices[i][1]]++;
        }
        int row = 0;
        int col = 0;
        int count = 0;
        while(row < n){
            while(col < m){
                count += (rows[row] + cols[col]) % 2 == 1 ? 1 : 0;
                col += 1;
            }
            col = 0;
            row += 1;
        }
        return count;
    }
    
}
