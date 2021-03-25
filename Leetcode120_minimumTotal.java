import java.util.ArrayList;
import java.util.List;

public class Leetcode120_minimumTotal {

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(2);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(3);
        l2.add(4);
        List<Integer> l3 = new ArrayList<Integer>();
        l3.add(6);
        l3.add(5);
        l3.add(7);
        List<Integer> l4 = new ArrayList<Integer>();
        l4.add(4);
        l4.add(1);
        l4.add(8);
        l4.add(3);
        triangle.add(l1);
        triangle.add(l2);
        triangle.add(l3);
        triangle.add(l4);
        System.out.println(minimumTotal(triangle));
    }

    // 递归超时 + 空间优化
    static Integer[][] memo;
    public static int minimumTotal(List<List<Integer>> triangle){
        memo = new Integer[triangle.size()][triangle.size()];
        return add(0, 0, triangle);
    }

    public static int add(int index, int row, List<List<Integer>> triangle){
        if(row == triangle.size()){
            return 0;
        }
        if(memo[row][index] != null){
            return memo[row][index];
        }
        return memo[row][index] = Math.min(add(index, row + 1, triangle), add(index + 1, row + 1, triangle)) + triangle.get(row).get(index);
    }
}
