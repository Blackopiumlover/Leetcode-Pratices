import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leetcode1200_minimumAbsDifference {

    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        List<List<Integer>> list = minimumAbsDifference(arr);
        System.out.println(list);
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr){
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Arrays.sort(arr);

        int minGap = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length - 1; i++){
            List<Integer> l = new ArrayList<>();
            if(arr[i + 1] - arr[i] > minGap){
                continue;
            }
            else if(arr[i + 1] - arr[i] < minGap){               
                minGap = arr[i + 1] - arr[i];
                list.removeAll(list);
                l.add(arr[i]);
                l.add(arr[i + 1]);
                list.add(l);
            }
            else{
                l.add(arr[i]);
                l.add(arr[i + 1]);
                list.add(l);
            }
            
        }
        return list;
    }
    
}
