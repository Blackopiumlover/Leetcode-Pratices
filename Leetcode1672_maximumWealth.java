public class Leetcode1672_maximumWealth {

    public static void main(String[] args) {
        int[] a1 = new int[]{1,2,3};
        int[] a2 = new int[]{3,2,1};
        int[][] accounts = new int[2][3];
        accounts[0] = a1;
        accounts[1] = a2;
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts){
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }       
}
