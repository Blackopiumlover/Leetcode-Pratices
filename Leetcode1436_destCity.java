import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode1436_destCity {


    public String destCity(List<List<String>> paths){
        Map<String, String> map = new HashMap<String, String>();
        for(List<String> list : paths){
            map.put(list.get(0),list.get(1));
        }
        for(List<String> list : paths){
            if(map.get(list.get(1)) == null){
                return list.get(1);
            }
        }
        return null;
    }
    
}
