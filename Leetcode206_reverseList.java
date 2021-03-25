public class Leetcode206_reverseList {

    // 递归
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return curr;
    }
    
    // 迭代
    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
