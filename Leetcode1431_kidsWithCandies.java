import java.util.ArrayList;
import java.util.List;

public class Leetcode1431_kidsWithCandies {
    
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int max = 0;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        List<Boolean> result = new ArrayList<Boolean>();
        for(int j = 0; j < candies.length; j++){
            if(candies[j] + extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}
