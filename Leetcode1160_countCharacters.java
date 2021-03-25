public class Leetcode1160_countCharacters {

    public static void main(String[] args) {
        String[] words = new String[]{"hello","world","leetcode"};
        System.out.println(countCharacters(words, "welldonehoneyr"));

        // StringBuilder sb = new StringBuilder();
        // String chars = "hellodasdsadasda";
        // String temp1 = chars;
        // String temp2 = chars;
        // sb.append(temp1.substring(0, 4));
        // sb.append(temp2.substring(5, temp2.length()));
    }

    public static int countCharacters(String[] words, String chars){
        int count = 0;
        for(String str : words){
            int j = 0;
            String ori = chars;
            for(int i = 0; i < str.length(); i++){
                int t = chars.indexOf(str.charAt(i));
                if(t < 0){
                    j = 1;
                    break;
                }
                StringBuilder sb = new StringBuilder();
                String temp = chars;
                sb.append(temp.substring(0, t)).toString();
                chars = sb.append(chars.substring(t + 1, chars.length())).toString();
                // System.out.println(chars);
            }
            if(j == 0){
                count = count + str.length();
            }
            chars = ori;
            // System.out.println(chars);
        }
        return count;
    }
    
}
