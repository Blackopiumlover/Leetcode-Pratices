public class MianShiTi02_02_kthToLast {

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        System.out.println(kthToLast(first, 2));
    }

    public static int kthToLast(ListNode head, int k){
        ListNode left = head;
        ListNode right = head;
        for(int i = 0; i < k; i++){
            right = right.next;
        }
        while(right != null){
            right = right.next;
            left = left.next;
        }
        return left.val;
    }
    
}
