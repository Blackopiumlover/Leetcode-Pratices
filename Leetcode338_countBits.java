public class Leetcode338_countBits {

    public static void main(String[] args) {
        for(int i : countBit(5)){
            System.out.print(i + " ");
        }
    }

    // 暴力解法，遍历 + 位运算
    public static int[] countBits(int nums){
        int[] bits = new int[nums + 1];
        for(int i = 0; i <= nums; i++){
            int x = i;
            int count = 0;
            while(x > 0){
                if((x & 1) == 1){
                    count++;
                }
                x = x >>> 1;
            }
            bits[i] = count;
        }
        return bits;
    }
    
    // 动态规划 + 位运算 + 奇偶性判断
    // 奇数的二进制比该数 - 1 得到的偶数，多一个 1
    // 1 0001   0 0000
    // 3 0011   2 0010
    // 偶数的二进制中 1 的个数和它的一半的偶数中 1 的个数一样多，只是最右位去掉了一个 0
    // 2 0010   0 0000  1 0001
    // 4 0100   2 0010
    // 8 1000   4 0100
    public static int[] countBit(int num){
        int[] bits = new int[num + 1];
        bits[0] = 0;
        for(int i = 1; i <= num; i++){
            if(i % 2 == 1){
                bits[i] = bits[i - 1] + 1;
            }
            else{
                bits[i] = bits[i / 2];
            }
        }
        return bits;
    }

    // 动态规划 + 位运算
    // 按位与运算的性质：
    // 对于任意整数 x，x = x & (x - 1)，可以将 x 的二进制表示的最后一个 1 变为 0
    // 对 x 重复该操作，直到 x 变成 0，则操作次数即为 x 中 1 的个数
    // 如果一个数是 2 的整数次幂，那么它只有最高位是 1，其他位都是 0
    // 如果 x 是 2 的整数次幂，那么 x & (x - 1) = 0
    // 0 0000   high = 0    1 0001  high = 1 bits[1] = bits[1 - 0] + 1
    // 2 0010   high = 2    3 0001  high = 2 bits[3] = bits[3 - 2] + 1
    // 4 0100   high = 4    5 0101  high = 4 bits[5] = bits[5 - 2] + 1    6 0110    high = 4 bits[6] = bits[6 - 2] + 1
    // 8 1000
    public static int[] dp(int num){
        int[] bits = new int[num + 1];
        int high = 0;
        for(int i = 1; i <= num; i++){
            if((i & (i - 1)) == 0){
                high = i;
            }
            bits[i] = bits[i - high] + 1;
        }
        return bits;
    }
}
