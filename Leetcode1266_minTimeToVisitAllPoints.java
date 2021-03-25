public class Leetcode1266_minTimeToVisitAllPoints {

    public static void main(String[] args) {
        System.out.println(AToB(new int[]{3,4}, new int[]{-1,0}));
        int[][] points = new int[3][2];
        points[0] = new int[]{1,1};
        points[1] = new int[]{3,4};
        points[2] = new int[]{-1,0};
        System.out.println(minTimeToVisitAllPoints(points));
    }

    public static int minTimeToVisitAllPoints(int[][] points){
        int sum = 0;
        for(int i = 0; i < points.length; i++){
            if(i + 1 >= points.length){
                break;
            }
            sum = sum + AToB(points[i], points[i + 1]);
        }
        return sum;
    }
    
    public static int AToB(int[] A, int [] B){
        int absx = Math.abs(B[0] - A[0]);
        int absy = Math.abs(B[1] - A[1]);
        return Math.min(absx, absy) + Math.abs(absx - absy);
    }
}
