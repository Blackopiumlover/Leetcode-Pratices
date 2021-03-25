public class Leetcode559_maxDepth {

    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        if(root.children == null){
            return 1;
        }
        int max = 0;
        for(Node node : root.children){
            int de = maxDepth(node);
            if(de > max){
                max = de;
            }
        }
        return max + 1;
    }
    
}
