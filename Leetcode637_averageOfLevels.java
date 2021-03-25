import java.util.LinkedList;
import java.util.List;

public class Leetcode637_averageOfLevels {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode l = new TreeNode(9);
        TreeNode r = new TreeNode(20);
        TreeNode rl = new TreeNode(15);
        TreeNode rr = new TreeNode(7);

        root.left = l;
        root.right = r;
        r.left = rl;
        r.right = rr;

        List<Double> list = averageOfLevels(root);
        System.out.println(list);
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new LinkedList<Double>();
        List<TreeNode> list1 = new LinkedList<TreeNode>();
        List<TreeNode> list2 = new LinkedList<TreeNode>();
        list1.add(root);
        ans.add((double)root.val);
        while(!list1.isEmpty()){
            TreeNode node = list1.remove(0);
            // ans.add((double)node.val);
            if(node.left != null){
                list2.add(node.left);
            }
            if(node.right != null){
                list2.add(node.right);
            }

            if(list1.isEmpty()){
                if(!list2.isEmpty()){
                    double sum = 0;
                    for(int i = 0; i < list2.size(); i++){
                        sum += list2.get(i).val;
                    }
                    ans.add(sum / list2.size());
                    // System.out.println(sum / list2.size());
                    list1 = list2;
                    list2 = new LinkedList<TreeNode>();
                }
            }
        }
        return ans;
    }
    
}
