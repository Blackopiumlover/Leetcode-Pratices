import java.util.HashSet;
import java.util.Set;

public class MianShiTi02_01_removeDuplicateNodes {

    public ListNode removeDuplicateNodes(ListNode head) {
        Set<Integer> set = new HashSet<Integer>();
        ListNode pre = new ListNode(0);
        ListNode curr = head;
        pre.next = curr;
        while(curr != null){
            if(!set.add(curr.val)){
                curr = curr.next;
                pre.next = curr;
            }
            else{
                curr = curr.next;
                pre = pre.next;
            }
        }
        return head;
    }
    
}
