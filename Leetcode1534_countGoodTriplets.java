public class Leetcode1534_countGoodTriplets {

    public static void main(String[] args) {
        System.out.println(countGoodTriplets(new int[]{3,0,1,1,9,7}, 7, 2, 3));
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c){
       
        int count = 0;
        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(isGood(arr[i], arr[j], arr[k], a, b, c)){
                        count = count + 1;
                    }
                }
            }    
        }
        return count;
    }
    public static boolean isGood(int first, int second, int third, int a, int b, int c){
        return (Math.abs(first - second) <= a) && (Math.abs(second - third) <= b) && (Math.abs(first - third) <= c);
    }


    // 提前结束循环，优化
    public static int another(int[] arr, int a, int b, int c){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(Math.abs(arr[i] - arr[j]) > a) continue; // 条件不满足提前退出
                for (int k = j+1; k < arr.length ; k++) {
                    if(Math.abs(arr[j] - arr[k]) > b) continue; // 条件不满足提前退出
                    if(Math.abs(arr[i] - arr[k]) <= c) count++; // 满足好三元组条件
                }
            }
        }
        return count;
    }
}
