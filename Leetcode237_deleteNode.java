public class Leetcode237_deleteNode {

    public static void main(String[] args) {
        ListNode first = new ListNode(4);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(9);
        first.next = second;
        second.next = third;
        third.next = fourth;
        
        deleteNode(second);

        ListNode curr = first;
        while(curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
    public static void deleteNode(ListNode node){
        ListNode next = node.next;
        int temp = next.val;
        next.val = node.val;
        node.val = temp;
        node.next = node.next.next;
    }
    
}
