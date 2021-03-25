import java.util.Stack;

// 注意：题中说，使用栈来实现，但是 Stack 继承了 Vector 接口，其底层是 Object[] 数组，中间发生
// 了空间扩容和移位的情况，如果想降低时间复杂度和空间复杂度，可以使用 LinkedList 来实现，其继承
// 了 Deque 接口，且能完成 Stack 的所有功能，底层是双向链表，用 addLast 来替代 push，用 removeLast
// 来替代 pop

public class JianZhi09_CQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public JianZhi09_CQueue(){
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    public void appendTail(int value){
        stack1.push(value);
    }

    public int deleteHead(){
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        if(stack1.isEmpty()){
            return -1;
        }
        
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
