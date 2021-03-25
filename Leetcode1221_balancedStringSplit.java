public class Leetcode1221_balancedStringSplit {

    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s){
        int count = 0;
        int vote = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R'){
                vote += 1;
            }
            else if(s.charAt(i) == 'L'){
                vote -= 1;
            }
            if(vote == 0){
                count += 1;
            }
        }
        return count;
    }
    
}
