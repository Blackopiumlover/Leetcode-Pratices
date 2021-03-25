import java.util.ArrayList;
import java.util.List;

public class Leetcode876_middleNode {

    // 数组下标法：
    public ListNode middleNode(ListNode head){
        List<ListNode> list = new ArrayList<ListNode>();
        while(head != null){
            list.add(head);
            head = head.next;
        }
        return list.get(list.size() / 2);
    }
    
    // 快慢指针法：
    public ListNode middle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
