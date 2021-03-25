import java.util.ArrayList;
import java.util.List;

public class Leetcode728_selfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = left; i <= right; i++){
            int number = i;
            int flag = 0;
            while(number != 0){
                int t = number % 10;
                if(t == 0){
                    flag = 1;
                    break;
                }
                if(i % t != 0){
                    flag = 1;
                    break;
                }
                number = number / 10;
            }
            if(flag == 0){
                list.add(i);
            }
        }
        return list;
    }
    
}
