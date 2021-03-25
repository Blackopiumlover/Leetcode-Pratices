public class Leetcode1720_decode {

    public static void main(String[] args) {
        int[] encoded = new int[]{6,2,7,3};
        for(int i : decode(encoded, 4)){
            System.out.println(i);
        }
    }

    // 注意：
    // a ^ b = c
    // a ^ b ^ b = a
    // 异或本身，就是异或的逆运算
    public static int[] decode(int[] encoded, int first){
        int[] ans = new int[encoded.length + 1];
        ans[0] = first;
        for(int i = 0; i < encoded.length; i++){
            ans[i + 1] = ans[i] ^ encoded[i];
        }
        return ans;
    }
    
}
