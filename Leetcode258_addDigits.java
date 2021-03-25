public class Leetcode258_addDigits {


    // 数根
    // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
    // 1 2 3 4 5 6 7 8 9  1  2  3  4  5  6  7  8  9  1  2  3  4
    // 9 个一次循环
    // 0 -> 0
    // 9 的倍数 -> 9
    // 非 9 的倍数 -> num % 9
    public int addDigits(int num){
        if(num == 0){
            return 0;
        }
        if(num % 9 == 0){
            return 9;
        }
        else{
            return num % 9;
        }
    }
    
}
