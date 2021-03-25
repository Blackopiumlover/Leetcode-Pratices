public class Leetcode1342_numberOfSteps {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps(123));
    }

    public static int numberOfSteps(int num){
        int count = 0;
        while(num != 0){
            if(isODD(num)){
                num = num / 2;
                count += 1;
            }
            else{
                num = num - 1;
                count += 1;
            }
        }
        return count;
    }
    public static boolean isODD(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
    
}
