import java.util.Stack;

public class Leetcode1290_getDecimalValue {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(0);
        ListNode third = new ListNode(1);
        head.next = second;
        second.next = third;
        System.out.println(anotherMethod(head));
    }

    // 栈操作
    public static int getDecimalValue(ListNode head){
        ListNode curr = head;
        Stack<Integer> stack = new Stack<Integer>();
        while(curr != null){
            stack.push(curr.val);
            curr = curr.next;
        }

        int ans = 0;
        int t = 0;
        while(!stack.isEmpty()){
            ans = ans + stack.pop() * (int)Math.pow(2, t);
            t = t + 1;
        }
        return ans;
    }
    
    // 位运算
    public static int anotherMethod(ListNode head){
        ListNode curr = head;
        int result = 0;
        while(curr != null){
            result = (result << 1) + curr.val;
            curr = curr.next;
        }
        return result;
    }
}
