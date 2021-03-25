public class Leetcode1669_mergeInBetween {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode fast = list1;
        ListNode slow = list1;
        int count = 0;
        while(count < a - 1){
            slow = slow.next;
            count++;
        }
        count = 0;
        while(count < b + 1){
            fast = fast.next;
            count++;
        }
        slow.next = list2;
        ListNode head2 =  list2;
        while(head2.next != null){
            head2 = head2.next;
        }
        head2.next = fast;
        return list1;
    }
    
}
