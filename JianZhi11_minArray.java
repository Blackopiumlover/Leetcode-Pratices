public class JianZhi11_minArray {

    public static void main(String[] args) {
        int[] arr1 = new int[]{3,4,5,1,2};
        // int[] arr2 = new int[]{2,2,2,0,1};
        // int[] arr3 = new int[]{2,2,2,2,2,2};
        System.out.println(minArray2(arr1));
    }

    public static int minArray1(int[] numbers){
        if(numbers.length == 1){
            return numbers[0];
        }
        int i = 0;
        while(true){
            int j = i + 1;
            if(numbers[i] > numbers[j]){
                return numbers[j];
            }
            i = i + 1;
            if(i == numbers.length - 1){
                break;
            }
        }
        return numbers[0];
    }
    
    public static int minArray2(int[] numbers){
        if(numbers.length == 1){
            return numbers[0];
        }
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < numbers[0]){
                return numbers[i];
            }
        }
        return numbers[0];
    }
}
