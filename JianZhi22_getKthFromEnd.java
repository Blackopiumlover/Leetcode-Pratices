public class JianZhi22_getKthFromEnd {
    
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        ListNode newHead = getKthFromEnd(head, 2);
        while(newHead != null){
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }

    public static ListNode getKthFromEnd(ListNode head, int k){
        
        ListNode left = head;
        ListNode right = head;
        while(k > 0){
            right = right.next;
            k = k - 1;
        }
        while(right != null){
            right = right.next;
            left = left.next;
        }
        return left;
    }
}
