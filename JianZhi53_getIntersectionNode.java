public class JianZhi53_getIntersectionNode{

    public static void main(String[] args){
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);
        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(0);
        ListNode b3 = new ListNode(1);
        ListNode c1 = new ListNode(8);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);
        a1.next = a2;
        a2.next = c1;
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;
        c1.next = c2;
        c2.next = c3;
        ListNode cross = getIntersectionNode(a1, b1);
        System.out.println(cross.val);
    }

    // 这看上去是一个死循环，如果两条链表没有交点，如何跳出循环呢？
    // 其实，当循环进行一定次数后
    // currA 和 currB 同时指向 null 的时候，他俩就相等了，但是他们并没有相交
    // 此时跳出循环
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode currA = headA;
        ListNode currB = headB;
        while(currA != currB){    
            if(currA == null){
                currA = headB;
            }
            else if(currA != null){
                currA = currA.next;
            }
            if(currB == null){
                currB = headA;
            }
            else if(currB != null){
                currB = currB.next;
            }
        }
        return currA;
    }
}