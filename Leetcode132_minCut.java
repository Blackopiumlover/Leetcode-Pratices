public class Leetcode132_minCut {

    public static void main(String[] args) {
        String s = "aabbdd";
        System.out.println(minCut(s));
    }

    public static int minCut(String s){
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int left = s.length() - 1; left >= 0; left--){
            for(int right = left; right < s.length(); right++){
                if(left == right){
                    dp[left][right] = true;
                }
                else if(right - left == 1){
                    dp[left][right] = s.charAt(left) == s.charAt(right) ? true : false;
                }
                else{
                    if(s.charAt(left) != s.charAt(right)){
                        dp[left][right] = false;
                    }
                    else{
                        dp[left][right] = dp[left + 1][right - 1];
                    }
                }
            }
        }
        /**
         * 得到1中的dp矩阵后，利用该矩阵得到最后结果的思路就比较容易了。
         * 设置一个dp2数组，dp2[i]标识字符串s从第0位到第i位可以组成的最少的子串数量。
         * 在dp矩阵中，对于每一个dp[j][i]为true的j，在dp2[j]中选择最小的值+1，就是dp2[i]的值。
         * 返回dp2[s.length() - 1] - 1，由于dp2数组表示的是子串的数量，n个子串只需要n-1次分割。
         * abbdd

         */
        int n = s.length();
        int[] dp2 = new int[n];
        dp2[0] = 1;
        for (int i = 1; i < n; ++i) {
            if (dp[0][i]) {
                dp2[i] = 1; 
            } else {
                int minimum = Integer.MAX_VALUE;
                for (int j = 1; j <= i; ++j) {
                    if (dp[j][i]) {
                        if (dp2[j - 1] < minimum) {
                            minimum = dp2[j - 1];
                        }
                    }
                }
                dp2[i] = minimum + 1;
            }
        }
        // for(int i = 0; i < dp2.length; i++){
        //     System.out.print(dp2[i] + "\t");
        // }
        // System.out.println();
        return dp2[n - 1] - 1;

    }
    
}
