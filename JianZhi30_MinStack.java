public class JianZhi30_MinStack {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(2);
        obj.push(0);
        obj.push(3);
        obj.push(0);
        System.out.println(obj.min());
        obj.pop();
        System.out.println(obj.min());
        obj.pop();
        System.out.println(obj.min());
        obj.pop();
        System.out.println(obj.min());
    }   
}

class MinStack {
    int index = 0;
    int[] stack;
    int[] min;
    public MinStack(){
        stack = new int[5];
        min = new int[5];
        // min[0] = Integer.MAX_VALUE;
    }
    public void push(int x){
        index = index + 1;
        stack[index] = x;
        int m = min[index - 1];
        if(x < m || index == 1){
            min[index] = x;
        }
        else{
            min[index] = min[index - 1];
        }
    }
    public void pop(){
        index = index - 1;
    }

    public int top(){
        return stack[index];
    }
    public int min(){
        return min[index];
    }
}
