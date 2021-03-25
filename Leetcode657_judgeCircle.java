public class Leetcode657_judgeCircle {

    public static void main(String[] args) {
        String s = "LL";
        System.out.println(judgeCircle(s));
    }

    public static boolean judgeCircle(String moves){
        int horizontal = 0;
        int level = 0;
        for(int i = 0; i < moves.length(); i++){
            if (moves.charAt(i) == 'U') {
                horizontal += 1;
            }
            if (moves.charAt(i) == 'D') {
                horizontal -= 1;
            }
            if(moves.charAt(i) == 'L'){
                level += 1;
            }
            if(moves.charAt(i) == 'R'){
                level -= 1;
            }
        }
        return horizontal == 0 && level == 0;
    }
    
}
