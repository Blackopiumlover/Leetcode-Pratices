public class Leetcode1588_sumOddLengthSubarrays {

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
        System.out.println(anotherMethor(arr));
    }

    // 暴力破解法：
    public static int sumOddLengthSubarrays(int[] arr){
        int sum = 0;
        int len = 1;
        if(arr.length % 2 == 1){
            while(len <= arr.length){
                int i = 0;
                while(i + len <= arr.length){
                    for(int j = i; j < i + len; j++){
                        // System.out.println(arr[j]);
                        sum = sum + arr[j];
                    }
                    i = i + 1;
                }
                len = len + 2;
            }
            return sum;
        }
        else{
            while(len <= arr.length - 1){
                int i = 0;
                while(i + len <= arr.length){
                    for(int j = i; j < i + len; j++){
                        // System.out.println(arr[j]);
                        sum = sum + arr[j];
                    }
                    i = i + 1;
                }
                len = len + 2;
            }
            return sum;
        }
        
    }

    // 数学法解决：
    // 找到一个数字到底出现在多少个子数组里 -> 一个数字到底出现在多少个奇数组里
    // 观察一个数组，[4,8,5,6,1]
    // 想知道 5 出现在多少个子数组里
    // 以 5 开始的数组 [4,8,5]  [8,5]   [5]
    // 以 5 结束的数组 [5]  [5,6]   [5,6,1]
    // 如果 5 出现在一个子数组中
    // 这个子数组可能是 3 种情况
    // （1）以 5 开始的数组
    // （2）以 5 结束的数组
    // （3）5 在中间的数组 == 以 5 开始的数组 拼接上 以 5 结束的数组
    // [4,8,5] + [5] = [4,8,5]
    // [4,8,5] + [5,6] = [4,8,5,6]
    // [4,8,5] + [5,6,1] = [4,8,5,6,1]
    // [8,5] + [5] = [8,5]
    // [8,5] + [5,6] = [8,5,6]
    // [8,5] + [5,6,1] = [8,5,6,1]
    // [5] + [5] = [5]
    // [5] + [5,6] = [5,6]
    // [5] + [5,6,1] = [5,6,1]
    // 有 3 * 3（start * end）种拼接方法
    // 所以存在 5 的连续子数组 = 以 5 开始的连续子数组 * 以 5 结束的连续子数组
    // 回到问题中
    // [4,8,5,6,1]
    // i    start   end    times
    // 0      5      1       5   
    // 1      4      2       8
    // 2      3      3       9
    // 3      2      4       8
    // 4      1      5       5
    // i   len - i i + 1    (len - i) * (i + 1)
    // 进阶问题：5 存在的连续奇数长度子数组有多少个？
    // 2 种情况：
    // 奇数个元素 + 5 + 奇数个元素 ------> [奇数个元素,5] + [5, 奇数个元素]
    // [8,5] + [5,6] = [8,5,6]
    // 偶数个元素 + 5 + 偶数个元素 ------> [偶数个元素,5] + [5, 偶数个元素]
    // [5] + [5] = [5]
    // [5] + [5,6,1] = [5,6,1]
    // [4,8,5] + [5] = [4,8,5]
    // [4,8,5] + [5,6,1] = [4,8,5,6,1]
    // 5 存在的连续奇数长度子数组个数 = 以 5 结束的奇数组 * 以 5 开始的奇数组 + 以 5 结束的偶数组 * 以 5 开始的偶数组
    // [4,8,5,6,1]
    // i    odd + i    i + odd    even + i    i + even    times
    // 0       0          2           1         3           3
    // 1       1          2           1         2           4
    // 2       1          1           2         2           5
    // 3       2          1           2         1           4
    // 4       2          0           3         1           3
    // i     (i+1)/2   (len-i)/2    i/2+1  (len-i-1)/2+1   
    public static int anotherMethor(int[] arr){
        if(arr == null || arr.length == 1){
            return arr[0];
        }
        int sum = 0;
        int len = arr.length;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i] * (((i + 1) / 2) * ((len - i) / 2) + (i / 2 + 1) * ((len - i - 1) / 2 + 1));
        }
        return sum;
    }    
}
