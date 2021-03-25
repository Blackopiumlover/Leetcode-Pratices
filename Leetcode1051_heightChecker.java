import java.util.Arrays;

public class Leetcode1051_heightChecker {

    public int heightChecker(int[] heights){
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
        int count = 0;
        for(int i = 0; i < sorted.length; i++){
            if(heights[i] != sorted[i]){
                count += 1;
            }
        }
        return count;
    }
    
}
