public class Leetcode2_addTwoNumbers {

    public static void main(String[] args) {
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;

        ListNode head = addTwoNumbers(l11, l21);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }

    }

    // 暴力破解法:
    // 注意：暴力破解法会因为运算范围超过 int 而报错，因此不能使用
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int number1 = 0;
        int square1 = 0;
        while(l1 != null){
            number1 = number1 + l1.val * (int)Math.pow(10, square1);
            square1++;
            l1 = l1.next;
        }

        int number2 = 0;
        int square2 = 0;
        while(l2 != null){
            number2 = number2 + l2.val * (int)Math.pow(10, square2);
            square2++;
            l2 = l2.next;
        }

        int sum = number1 + number2;
        ListNode head = new ListNode(sum % 10);
        sum = sum / 10;
        ListNode curr = head;
        while(sum != 0){
            ListNode node = new ListNode(sum % 10);
            curr.next = node;
            curr = curr.next;
            sum = sum / 10;
        }
        return head;
    }

    // 正确解法：节点相加，大于 10 进一，保护头节点
    public static ListNode add(ListNode l1, ListNode l2){
        ListNode emptyHead = new ListNode(0);
        ListNode curr = emptyHead;
        ListNode p = l1;
        ListNode q = l2;
        int carry = 0;
        while(p != null || q != null){
            int x = 0;
            int y = 0;
            if(p != null){
                x = p.val;
            }
            if(q != null){
                y = q.val;
            }
            int value = x + y + carry;
            if(value >= 10){
                value = value - 10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            ListNode node = new ListNode(value);
            curr.next = node;
            curr = curr.next;
            if(p != null){
                p = p.next;
            }
            if(q != null){
                q = q.next;
            }
        }
        if(carry == 1){
            ListNode last = new ListNode(1);
            curr.next = last;
        }
        return emptyHead.next;
    }
    
}
