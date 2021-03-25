import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode1539_findKthPositive {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        System.out.println(findKthPositive(arr, 2));
    }

    public static int findKthPositive(int[] arr, int k){
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i : arr){
            set.add(i);
        }
        int count = 0;
        int num = 1;
        while(true){
            if(set.add(num)){
                list.add(num);
                count++;
            }
            num++;
            if(count == k){
                break;
            }
        }
        return list.get(k - 1);
    }

    // 2 3 4 7 11
    // 0 1 2 3 4
    public static int anotherMethod(int[] arr, int k){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] - i - 1 >= k){
                return k + i;
            }
        }
        return arr.length + k;
    }
}
