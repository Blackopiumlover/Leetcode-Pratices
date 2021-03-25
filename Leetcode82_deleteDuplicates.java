public class Leetcode82_deleteDuplicates {

    public ListNode deleteDuplicates(ListNode head){
        if(head == null){
            return head;
        }
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode curr = head;
        while(curr.next != null){
            ListNode next = curr.next;
            if(curr.val == next.val){
                while(next != null && next.val == curr.val){
                    next = next.next;
                }
                pre.next = next;
                curr = next;
                if(curr == null){
                    break;
                }
            }
            else{
                pre = curr;
                curr = next;
            }    
        }
        return dummyHead.next;
    }
    
}
