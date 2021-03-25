import java.util.ArrayList;
import java.util.List;

public class Leetcode118_generate {
    public static void main(String[] args) {
        List<List<Integer>> list = generate(4);
        for(List<Integer> l : list){
            System.out.println(l);
        }
    }
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0){
            return list;
        }
        if(numRows == 1){
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list.add(list1);
            return list;
        }
        else{
            List<List<Integer>> preList = generate(numRows - 1);
            List<Integer> l = preList.get(numRows - 2);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int i = 0; i < l.size() - 1; i++){
                curr.add(l.get(i) + l.get(i + 1));
            }
            curr.add(1);
            list.addAll(preList);
            list.add(curr);
        }
        return list;
    }
    
}
