public class MianShiTi02_07_getIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode hA = headA;
        ListNode hB = headB;
        if(headA == null || headB == null){
            return null;
        }
        while(true){
            if(hA == hB){
                break;
            }
            else{
                hA = hA == null ? headB : hA.next;
                hB = hB == null ? headA : hB.next;                
            }
        }
        return hA;
    }
    
}
