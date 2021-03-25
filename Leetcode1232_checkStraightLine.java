public class Leetcode1232_checkStraightLine {


    public boolean checkStraightLine(int[][] coordinates){
        for(int i = 1; i < coordinates.length - 1; i++){
            int res1 = (coordinates[i][0] - coordinates[i - 1][0]) * (coordinates[i + 1][1] - coordinates[i][1]);
            int res2 = (coordinates[i + 1][0] - coordinates[i][0]) * (coordinates[i][1] - coordinates[i - 1][1]);
            if(res1 != res2){
                return false;
            }
        }
        return true;
    }
    
}
