public class MianShiTi02_03_deleteNode {
    
    public static void deleteNode(ListNode node){
        ListNode next = node.next;
        int temp = node.val;
        node.val = next.val;
        next.val = temp;
        node.next = node.next.next;
    }
}
