import java.util.ArrayList;
import java.util.List;

public class Leetcode119_2_getRow {

    public static void main(String[] args) {
        List<Integer> list = getRow(3);
        for(int i : list){
            System.out.println(i);
        }
    }

    public static List<Integer> getRow(int rowIndex){
        List<Integer> list = new ArrayList<Integer>();
        if(rowIndex == 0){
            list.add(1);
            return list;
        }
        if(rowIndex == 1){
            list.add(1);
            list.add(1);
            return list;
        }
        List<Integer> former = getRow(rowIndex - 1);
        list.add(1);
        for(int i = 1; i < former.size(); i++){
            list.add(former.get(i - 1) + former.get(i));
        }
        list.add(1);
        return list;
    }
    
}
