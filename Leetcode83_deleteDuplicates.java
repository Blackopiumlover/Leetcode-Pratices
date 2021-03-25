public class Leetcode83_deleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {       
        ListNode pre = head;
        if(pre == null){
            return head;
        }
        ListNode curr = head.next;
        while(curr != null){
            if(curr.val == pre.val){
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
