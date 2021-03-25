public class JianZhi40_getLeastNumbers{

    public static void main(String[] args){
        int[] arr = new int[]{4,5,1,6,2,7,3,8};
        int[] ans = getLeastNumbers(arr, 4);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }

    public static int[] getLeastNumbers(int[] arr, int k){
        if(arr == null){
            return null;
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int[] ans = new int[k];
        for(int p = 0; p < k; p++){
            ans[p] = arr[p];
        }

        return ans;
    }
}