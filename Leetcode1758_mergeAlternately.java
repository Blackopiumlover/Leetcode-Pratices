public class Leetcode1758_mergeAlternately {

    public static void main(String[] args) {
        String word1 = "";
        String word2 = "";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2){
        if(word1 == null || word1.length() == 0){
            return word2;
        }
        if(word2 == null || word2.length() == 0){
            return word1;
        }
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int flag = 0;
        while(index < word1.length() && index < word2.length()){
            sb.append(word1.charAt(index));
            sb.append(word2.charAt(index));
            index++;
            if(index == word1.length()){
                flag = 1;
            }
            if(index == word2.length()){
                flag = 2;
            }
        }
        if(flag == 1){
            sb.append(word2.substring(index));
            return sb.toString();
        }
        if(flag == 2){
            sb.append(word1.substring(index));
            return sb.toString();
        }
        return sb.toString();
    }
    
}
