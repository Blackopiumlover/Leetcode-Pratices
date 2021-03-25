public class Leetcode1710_maximumUnits {

    public static void main(String[] args) {
        int[][] boxTypes = new int[][]{
            {5,10},{2,5},{4,7},{3,9}
        };

        System.out.println(maximumUnits(boxTypes, 10));
        for(int[] arr : boxTypes){
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        for(int i = 0; i < boxTypes.length; i++){
            for(int j = i + 1; j < boxTypes.length; j++){
                if(boxTypes[i][1] < boxTypes[j][1]){
                    int[] temp = boxTypes[i];
                    boxTypes[i] = boxTypes[j];
                    boxTypes[j] = temp;
                }
            }
        }

        int res = 0;
        for(int i = 0; i < boxTypes.length; i++){
            if(boxTypes[i][0] <= truckSize){
                res += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            else{
                res += truckSize * boxTypes[i][1];
                return res;
            }
        }
        return res;
    }
    
}
