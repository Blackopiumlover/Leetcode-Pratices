public class Leetcode771_numJewelsInStones {

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbb";
        System.out.println(anotherMethod(J, S));
    }

    public static int numJewelsInStones(String jewels, String stones){
        if(jewels.length() == 0 || stones.length() == 0){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < stones.length(); i++){
            if(jewels.indexOf(stones.charAt(i)) < 0){
                continue;
            }
            count = count + 1;
        }
        return count;
    }

    public static int anotherMethod(String jewels, String stones){
        if(jewels.length() == 0 || stones.length() == 0){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < stones.length(); i++){
            char c = stones.charAt(i);
            if(jewels.indexOf(c) >= 0 ){
                count = count + 1;
            }
        }
        return count;
    }
    
}
