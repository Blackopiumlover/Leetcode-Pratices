public class Leetcode160_getIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode h1 = headA;
        ListNode h2 = headB;
        while(true){
            if(h1 == h2){
                break;
            }
            else{
                h1 = h1 == null ? headB : h1.next;
                h2 = h2 == null ? headA : h2.next;
            }
        }
        return h1;
    }
    
}
