import java.util.Stack;

public class pushBottom {

    private static void sol(Stack<Integer> stack, int data){
        if(stack.size()==0){
            stack.push(data);
            return;
        }
        int pop=stack.pop();
        sol(stack, data);
        stack.push(pop);
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        sol(stack, 4);
       while(!stack.isEmpty()){
           System.out.println(stack.pop());
       }
    }
}
