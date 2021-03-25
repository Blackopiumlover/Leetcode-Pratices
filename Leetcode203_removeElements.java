public class Leetcode203_removeElements {

    public ListNode removeElements(ListNode head, int val){
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode curr = dummyHead;
        while(curr != null){
            if(curr.next != null && curr.next.val == val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return dummyHead.next;
    }
    
}
