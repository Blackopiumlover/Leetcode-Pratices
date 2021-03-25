import java.util.HashMap;

public class Leetcode1189_maxNumberOfBalloons {

    public static void main(String[] args) {
        // String s1 = "nlaebolko";
        String s2 = "loonbalxballpoon";
        // String s3 = "leetcode";
        // String s4 = "balon";
        System.out.println(maxNumberOfBalloons(s2));

    }

    public static int maxNumberOfBalloons(String text){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < text.length(); i++){
            if(map.containsKey(text.charAt(i))){
                map.replace(text.charAt(i), map.get(text.charAt(i)), map.get(text.charAt(i)) + 1);
            }
            else{
                map.put(text.charAt(i), 1);
            }
        }
        
        System.out.println(map);

        int count = 0;
        while(true){
            if(map.containsKey('b') && map.get('b') > 0){
                map.replace('b', map.get('b'), map.get('b') - 1);
            }
            else{
                break;
            }
            if(map.containsKey('a') && map.get('a') > 0){
                map.replace('a', map.get('a'), map.get('a') - 1);
            }
            else{
                break;
            }           
            if(map.containsKey('l') && map.get('l') > 1){
                map.replace('l', map.get('l'), map.get('l') - 2);
            }
            else{
                break;
            }
            if(map.containsKey('o') && map.get('o') > 1){
                map.replace('o', map.get('o'), map.get('o') - 2);
            }
            else{
                break;
            }
            if(map.containsKey('n') && map.get('n') > 0){
                map.replace('n', map.get('n'), map.get('n') - 1);
            }
            else{
                break;
            }
            count++;
        }
        System.out.println(map);
        return count;
    }
}
