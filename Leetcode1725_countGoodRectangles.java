public class Leetcode1725_countGoodRectangles {

    public static void main(String[] args) {
        int[][] rectangles = new int[][]{new int[]{5,8}, new int[]{3,9}, new int[]{5,12}, new int[]{16,5}};
        System.out.println(countGoodRectangles(rectangles));
    }

    public static int countGoodRectangles(int[][] rectangles){
        int count = 0;
        int maxLen = 0;
        for(int i = 0; i < rectangles.length; i++){
            int len = Math.min(rectangles[i][0], rectangles[i][1]);
            if(len > maxLen){
                maxLen = len;
                count = 1;
            }
            else if(len == maxLen){
                count += 1;
            }
        }
        return count;
    }
    
}
