import java.util.Deque;
import java.util.LinkedList;

public class Leetcode445_addTwoNumbers {
    public static void main(String[] args) {
        ListNode l11 = new ListNode(7);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        ListNode l14 = new ListNode(3);
        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;
        l21.next = l22;
        l22.next = l23;

        ListNode head = addTwoNumbers(l11, l21);
        while(head != null){
            System.out.print(head.val + "\t");
            head = head.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        Deque<Integer> stack1 = new LinkedList<Integer>();
        Deque<Integer> stack2 = new LinkedList<Integer>();

        ListNode curr1 = l1;
        while(curr1 != null){
            stack1.push(curr1.val);
            curr1 = curr1.next;
        }

        ListNode curr2 = l2;
        while(curr2 != null){
            stack2.push(curr2.val);
            curr2 = curr2.next;
        }

        Deque<Integer> stack3 = new LinkedList<Integer>();
        int carry = 0;
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            int sum = 0;
            if(!stack1.isEmpty() && !stack2.isEmpty()){
                sum = stack1.pop() + stack2.pop() + carry;
            }
            else if(stack1.isEmpty() && !stack2.isEmpty()){
                sum = stack2.pop() + carry;
            }
            else if(stack2.isEmpty() && !stack1.isEmpty()){
                sum = stack1.pop() + carry;
            }
            if(sum >= 10){
                stack3.push(sum % 10);
                carry = 1;
            }
            else{
                stack3.push(sum);
                carry = 0;
            }            
        }
        if(carry == 1){
            stack3.push(1);
        }
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while(!stack3.isEmpty()){
            ListNode node = new ListNode(stack3.pop());
            curr.next = node;
            curr = node;
        }
        return head.next;
    }
    
}
