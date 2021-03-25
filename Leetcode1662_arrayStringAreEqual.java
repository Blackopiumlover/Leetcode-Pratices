public class Leetcode1662_arrayStringAreEqual {

    public static void main(String[] args) {
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};
        System.out.println(arrayStringAreEqual(word1, word2));
    }

    public static boolean arrayStringAreEqual(String[] word1, String[] word2){
        StringBuilder sb1 = new StringBuilder();
        for(String str : word1){
            sb1.append(str);
        }
        StringBuilder sb2 = new StringBuilder();
        for(String str : word2){
            sb2.append(str);
        }
        return sb1.toString().equals(sb2.toString());
    }
    
}
