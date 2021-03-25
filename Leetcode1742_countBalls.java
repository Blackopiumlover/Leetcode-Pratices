import java.util.HashMap;
import java.util.Map;

public class Leetcode1742_countBalls {

    public static void main(String[] args) {
        System.out.println(countBalls(1, 10));
        System.out.println(countBalls(5, 15));
        System.out.println(countBalls(19, 28));
    }

    public static int countBalls(int lowLimit, int highLimit){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = lowLimit; i <= highLimit; i++){
            int number = i;
            int sum = 0;
            while(number != 0){
                sum += number % 10;
                number /= 10;
            }

            if(map.containsKey(sum)){
                map.replace(sum, map.get(sum), map.get(sum) + 1);
            }
            else{
                map.put(sum, 1);
            }
        }
        
        System.out.println(map);
        int max = 0;
        int maxIndex = 0;
        for(int i : map.keySet()){
            if(map.get(i) > max){
                max = map.get(i);
                maxIndex = i;
            }
        }
        return map.get(maxIndex);
    }
    
}
