public class ReverseLinkedList{
    public static void main(String[] args){
        Node head = new Node(0);
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node (5);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
		
		Node curr = head;
        while(curr != null){
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        
        System.out.println();
        System.out.println("------------------");

        Node newHead = reverse(head);
        while(newHead != null){
            System.out.print(newHead.value + " -> ");
            newHead = newHead.next;
        }
    }

    public static Node reverse(Node head){
        if(head == null){
            return null;
        }

        Node newHead = null;
        Node pre = null;
        Node curr = head;
        
        while(curr != null){
            Node next = curr.next;
            if(next == null){
                newHead = curr;
                curr.next = pre;
                break;
            }
            else{
                curr.next = pre;
                pre = curr;
                curr = next;
            }
        }
        return newHead;
    }

    static class Node{
        Node next;
        int value;
        public Node(int value){
            this.value = value;
        }
    }
}