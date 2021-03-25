public class Leetcode1550_threeConsecutiveOdds {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));
    }

    public static boolean threeConsecutiveOdds(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                count = count + 1;
            }
            else{
                count = 0;
            }
            if(count == 3){
                return true;
            }
        }
        return false;
    }
    
}
