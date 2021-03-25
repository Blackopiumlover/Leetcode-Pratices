public class Leetcode234_isPalindrome {

    /**
     * 1 -> 2 -> 2 -> 1
     * 当 fast == null 的时候，slow 指向第二个 2
     * 1 -> 2 -> 2 -> 1
     *          slow    fast
     * 此时反转 slow 后边的链表，让 slow 等于新的头结点，让 fast 等于头节点
     * 1 -> 2 -> 1 -> 2
     * fast     slow
     * 依次往下遍历，如果 fast 的值和 slow 的值不等，返回 false，遍历结束，返回 true
     * 
     * 1 -> 2 -> 3 -> 2 -> 1
     *          slow      fast
     * 此时链表长度是奇数，如果反转 slow 为头的子链表，则原来的中间元素 3 被放到末尾，出现问题
     * 所以让 slow = slow.next，再进行反转
     * 1 -> 2 -> 3 -> 1 -> 2
     * fast         slow
     */
    public static boolean isPalindrome(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        
        slow = reverse(slow);

        fast = head;
        while(slow != null){
            if(fast.val != slow.val){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;

    }
    public static ListNode reverse(ListNode head){
        ListNode pre = null;
        while(head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
