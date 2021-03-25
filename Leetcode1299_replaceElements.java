public class Leetcode1299_replaceElements {

    public static void main(String[] args) {
        int[] arr = new int[]{17,18,5,4,6,1};
        int[] replace = anotherMethod(arr);
        for(int i : replace){
            System.out.println(i);
        }
    }

    // 从左向右遍历
    public static int[] replaceElements(int[] arr){
        if(arr.length == 1){
            return new int[]{-1};
        }

        int index = 0;
        while(true){
            if(index + 1 >= arr.length){
                arr[index] = -1;
                break;
            }
            int max = arr[index + 1];
            for(int i = index + 1; i < arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            arr[index] = max;
            index++;
        }
        return arr;
    }

    // 从右向左遍历
    public static int[] anotherMethod(int[] arr){
        int[] ans = new int[arr.length];
        ans[arr.length - 1] = -1;
        int max = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; i--){
            if(arr[i] > max){
                max = arr[i];
            }
            ans[i - 1] = max;
        }
        return ans;
    }
}
