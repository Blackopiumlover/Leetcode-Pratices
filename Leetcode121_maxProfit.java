public class Leetcode121_maxProfit {

    public static void main(String[] args) {
        int[] prices = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            if(prices[i] - min > maxProfit){
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }
    
}
