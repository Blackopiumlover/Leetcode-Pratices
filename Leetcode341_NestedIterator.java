import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Leetcode341_NestedIterator implements Iterator<Integer> {
    List<Integer> list = new ArrayList<Integer>();
    int i;
    
    public Leetcode341_NestedIterator(List<NestedInteger> nestedList) {
        getAllNumbers(nestedList);
    }

    @Override
    public Integer next() {
        return list.get(i++);
    }

    @Override
    public boolean hasNext() {
        return i < list.size();
    }

    public void getAllNumbers(List<NestedInteger> nestedList){

        for(NestedInteger l : nestedList){
            if(l.isInteger()){
                list.add(l.getInteger());
            }
            else{
                getAllNumbers(l.getList());
            }
        }
    }
}
