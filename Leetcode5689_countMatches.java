import java.util.List;

public class Leetcode5689_countMatches {
    
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int count = 0;
        switch(ruleKey){
            case "type":
            for(List<String> list : items){
                if(list.get(0).equals(ruleValue)){
                    count += 1;
                }
            }
            break;

            case "color":
            for(List<String> list : items){
                if(list.get(1).equals(ruleValue)){
                    count += 1;
                }
            }
            break;

            case "name":
            for(List<String> list : items){
                if(list.get(2).equals(ruleValue)){
                    count += 1;
                }
            }
            break;
        }
        return count;
    }
    
}
