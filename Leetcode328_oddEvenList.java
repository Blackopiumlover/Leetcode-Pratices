public class Leetcode328_oddEvenList {

    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        ListNode pre = head;
        ListNode curr = head.next;
        ListNode evenHead = curr;

        while(curr != null && curr.next != null){
            ListNode next = curr.next;
            pre.next = curr.next;
            curr.next = next.next;
            pre = next;
            curr = next.next;
        }
        pre.next = evenHead;
        return head;
    }
    
}
