public class Leetcode115_numDistinct {


    /**
     *      0    b    ba    bab    babg    babgb    babgba    babgbag
     * 0    1    1    1      1      1       1          1        1
     * b    0    1    1      2      2       3          3        3
     * ba   0    0    1      1      1       1          4        4
     * bag  0    0    0      0      1       1          1        5
     * 
     * 
     * @param s
     * @param t
     * @return
     */

    public static int numDistinct(String s, String t){
        if(t.length() > s.length()){
            return 0;
        }

        int[][] dp = new int[t.length() + 1][s.length() + 1];
        for(int i = 0; i < s.length(); i++){
            dp[0][i] = 1;
        }

        for(int i = 1; i <= t.length(); i++){
            for(int j = 1; j < s.length(); j++){
                if(s.charAt(j - 1) == t.charAt(i - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                }
                else{
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }

        return dp[t.length()][s.length()];
    }
    
}
