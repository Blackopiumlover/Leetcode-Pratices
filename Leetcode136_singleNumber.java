public class Leetcode136_singleNumber {

    // n ^ 0 = n
    // n ^ n = 0
    // a ^ b ^ c = a ^ c ^ b
    // 所以一个数，如果有和他重复的数，那么二者异或的结果一定是 0
    // 除了只出现一次的那个数，其他的所有数异或的结果是 0
    // 只出现一次的那个数，异或上 0 等于那个数本身
    public int singleNumber(int[] nums){
        int single = 0;
        for(int i : nums){
            single ^= i;
        }
        return single;
    }
    
}
