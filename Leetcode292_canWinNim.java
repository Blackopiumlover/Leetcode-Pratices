public class Leetcode292_canWinNim {
    // 保证最后一次对手拿的时候，还有 4 个石头
    public boolean canWinNim(int n) {
        if(n <= 3){
            return true;
        }
        return n % 4 != 0;
    }
}
