import java.util.ArrayList;
import java.util.List;

public class Leetcode1656_OrderedStream {

    int ptr;
    String[] strs;

    public Leetcode1656_OrderedStream(int n){
        strs = new String[n];
        ptr = 1;
    }
    
    public List<String> insert(int idKey, String value) {
        strs[idKey - 1] = value;
        List<String> list = new ArrayList<String>();
        while(true){
            if(ptr > strs.length || strs[ptr - 1] == null){
                return list;
            }
            else{
                list.add(strs[ptr - 1]);
                ptr += 1;
            }
        }
    }
}
