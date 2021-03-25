public class Leetcode1323_maximum69Number {

    public static void main(String[] args) {
        System.out.println(maxiumnum69Number(9669));
    }

    // 手撕字符串
    public static int maxiumnum69Number(int num){
        String number = num + "";
        char[] numbers = number.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == '6'){
                numbers[i] = '9';
                break;
            }
        }
        return Integer.valueOf(sb.append(numbers).toString());
    }
    
    // api 一句话
    public static int api(int num){
        return Integer.valueOf(String.valueOf(num).replaceFirst("6","9"));
    }

    //
}
