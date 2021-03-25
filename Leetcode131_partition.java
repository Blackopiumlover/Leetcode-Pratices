import java.util.LinkedList;
import java.util.List;

public class Leetcode131_partition {
    public static void main(String[] args) {
        String s = "adda";
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
        
        for(boolean[] b : dp){
            for(boolean bs : b){
                System.out.print(bs + "\t");
            }
            System.out.println();
        }
    }
    
    // 暴力递归
    public List<List<String>> partition(String s) {
        List<List<String>> res = new LinkedList<List<String>>();
        List<String> ans = new LinkedList<String>(); 

        if(s == null || s.length() == 0){
            res.add(ans);
            return res;
        }

        for(int i = 0; i < s.length(); i++){
            if(isPar(s, 0, i)){
                String left = s.substring(0, i + 1);
                String right = s.substring(i + 1);
                for(List<String> rightLists : partition(right)){
                    List<String> sub = new LinkedList<String>();
                    sub.add(left);
                    sub.addAll(rightLists);
                    res.add(sub);
                }
            }    
        }
        return res;
    }

    public boolean isPar(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    // 动态规划 + 回溯算法 dp[i][j] 表示从 i 到 j 是否是一个回文串
    public List<List<String>> par(String s){

        boolean[][] dp = new boolean[s.length()][s.length()];

        // 注意：如果从上往下赋值 dp，当长度距离超过 2 的时候，该点的值，取决于左下角的值
        // 以 adda 为例
        /**
         *              left     
         *              0   1   2   3
         *  right   0   t   f   f   t
         *          1   x   t   t   f
         *          2   x   x   t   f
         *          3   x   x   x   t
         *  x 是不需要关注的点，因为右索引大于左索引，所以只要从右索引=左索引开始关注就行了
         *  当关注的长度超过 2 的时候，比如，0 到 3 是回文吗？此时 s.charAt(0) = s.charAt(3) = 'a'
         *  那就要看 1 到 2 是不是回文
         *  所以如果从上往下赋值，此时左下角的还没有赋值，故赋值结果是不正确的，所以需要从下往上赋值
         */
        for(int left = s.length() - 1; left >= 0; left--){
            for(int right = left; right < s.length(); right++){
                if(left == right){
                    // 如果 左=右，则是一个字符，是回文
                    dp[left][right] = true;
                }
                else if(right - left == 1){
                    // 如果 右-左=1，则是两个字符，如果两个字符相同，是回文，不相同则不是
                    dp[left][right] = s.charAt(left) == s.charAt(right) ? true : false;
                }
                else{
                    // 此时，长度超过两个字符，如果左字符和右字符不同，肯定不是回文
                    if(s.charAt(left) != s.charAt(right)){
                        dp[left][right] = false;
                    }
                    else{
                        // 左字符和右字符相同，那么要看 左+1 到 右-1 的字符串是不是回文字符串
                        dp[left][right] = dp[left + 1][right - 1];
                    }
                }
            }
        }

        // 此时完成了 dp 的赋值，使用回溯算法：
        return dfs(s, dp, 0);
    }
    private List<List<String>> dfs(String s, boolean[][] dp, int startIndex){
        List<List<String>> res = new LinkedList<List<String>>();
        if(startIndex == s.length()){
            // 空字符，返回空 list
            List<String> ans = new LinkedList<String>();
            res.add(ans);
            return res;
        }

        for(int endIndex = startIndex; endIndex < s.length(); endIndex++){
            if(dp[startIndex][endIndex]){
                String left = s.substring(startIndex, endIndex + 1);
                for(List<String> ans : dfs(s, dp, endIndex + 1)){
                    ans.add(0,left);
                    res.add(ans);
                }
            }
        }
        return res;
    }
}
