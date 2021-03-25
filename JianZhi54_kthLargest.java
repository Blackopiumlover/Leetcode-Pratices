import java.util.LinkedList;

public class JianZhi54_kthLargest {
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        TreeNode L1 = new TreeNode(1);
        TreeNode R1 = new TreeNode(4);
        TreeNode L21 = new TreeNode(2);
        root.left = L1;
        root.right = R1;
        L1.right = L21;

        System.out.println(kthLargest(root, 1));
    }

    public static int kthLargest(TreeNode root, int k){
        int[] list = getList(root);
        return list[list.length - k];
    }

    private static void preOrder(TreeNode root, LinkedList<Integer> list){
        if(root == null){
            return ;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

    private static int[] getList(TreeNode root){
        LinkedList<Integer> list = new LinkedList<Integer>();
        preOrder(root, list);
        int[] ans = new int[list.size()];
        int i = 0;
        while(!list.isEmpty()){
            ans[i] = list.pop();
            i++;
        }
        for(int j = 0; j < ans.length; j++) {
        	for(int k = j + 1; k < ans.length; k++) {
        		if(ans[j] > ans[k]) {
        			int temp = ans[j];
        			ans[j] = ans[k];
        			ans[k] = temp;
        		}
        	}
        }
        return ans;
    }
}
