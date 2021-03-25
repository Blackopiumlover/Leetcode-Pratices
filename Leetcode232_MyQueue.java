import java.util.Deque;
import java.util.LinkedList;

public class Leetcode232_MyQueue {

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public Leetcode232_MyQueue(){
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    public void push(int x){
        stack1.push(x);        
    }

    public int pop(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
    
}
