import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Leetcode1700_countStudents {
    
    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        System.out.println(countStudents(students, sandwiches));
    }

    public static int countStudents(int[] students, int[] sandwiches){
        Stack<Integer> stack = new Stack<>();
        for(int i = sandwiches.length - 1; i >= 0; i--){
            stack.push(sandwiches[i]);
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < students.length; i++){
            queue.add(students[i]);
        }

        int count = 0;
        while(!stack.isEmpty()){
            int want = queue.poll();
            if(want == stack.peek()){
                stack.pop();
                count = 0;
            }
            else{
                queue.add(want);
                count += 1;
                if(count == queue.size()){
                    break;
                }
            }
        }

        return queue.size();
    }
    
}
