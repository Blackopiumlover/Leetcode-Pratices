import java.util.HashSet;

public class Leetcode961_repeatNTimes {

    public int repeatedNTimes(int[] A) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : A){
            if(!set.add(i)){
                return i;
            }
            else{
                set.add(i);
            }
        }
        return 0;
    }
    
}
