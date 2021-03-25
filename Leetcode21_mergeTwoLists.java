public class Leetcode21_mergeTwoLists {

    public static void main(String[] args) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;
        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;
        ListNode head = mergeTwoLists(l11, l21);
        while(head != null){
            System.out.print(head.val + "\t");
            head = head.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){        
        ListNode head = new ListNode(0);
        ListNode curr = new ListNode(0);
        head.next = curr;
        while(true){
            if(l1 != null && l2 != null){
                if(l1.val < l2.val){
                    ListNode next = new ListNode(l1.val);
                    curr.next = next;
                    curr = next;
                    l1 = l1.next;
                }
                else{
                    ListNode next = new ListNode(l2.val);
                    curr.next = next;
                    curr = next;
                    l2 = l2.next;
                }
            }
            else if(l1 != null && l2 == null){
                curr.next = l1;
                break;
            }
            else if(l2 != null && l1 == null){
                curr.next = l2;
                break;
            }
            else{
                break;
            }
        }
        return head.next.next;
    }
        
    
}
