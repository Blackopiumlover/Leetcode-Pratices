public class Leetcode1732_largestAltitude {

    public static void main(String[] args) {
        // int[] gain = new int[]{-5,1,5,0,-7};
        int[] gain = new int[]{-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    
    public static int largestAltitude(int[] gain){
        int index = 0;
        int[] actual = new int[gain.length + 1];
        actual[0] = 0;
        int max = actual[0];
        while(index < gain.length){
            index++;
            actual[index] = actual[index - 1] + gain[index - 1];
            
            if(actual[index] > max){
                max = actual[index];
            }
        }
        return max;
    }
    
}
