public class Leetcode1450_busyStudent {

    public static void main(String[] args) {
        int[] startTime = new int[]{1,2,3};
        int[] endTime = new int[]{3,2,7};
        System.out.println(busyStudent(startTime, endTime, 4));
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime){
        int count = 0;
        for(int i = 0; i < startTime.length; i++){
            if(startTime[i] <= queryTime && endTime[i] >= queryTime){
                count++;
            }
        }
        return count;
    }
    
}
