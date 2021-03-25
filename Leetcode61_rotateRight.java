public class Leetcode61_rotateRight {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ListNode head = rotateRight(a, 6);
        while(head != null){
            System.out.print(head.val + "->");
            head = head.next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        ListNode curr = head;
        int len = 1;
        while(curr.next != null){
            curr = curr.next;
            len++;
        }
        System.out.println(len);
        curr.next = head;
        
        k = k % len;

        ListNode newCurr = head;
        for(int i = 0; i < len - k - 1; i++){
            // System.out.println(newCurr.val);
            newCurr = newCurr.next;
        }
        ListNode newHead = newCurr.next;
        newCurr.next = null;
        return newHead;
    }
}
