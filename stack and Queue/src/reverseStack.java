import java.util.Stack;

public class reverseStack {
    private static void sol(Stack<Integer> stack, Stack<Integer> tempstack){
       if(stack.isEmpty()){
           return;
       }
       int pop=stack.pop();
       tempstack.push(pop);
       sol(stack, tempstack);


    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        Stack<Integer> tempstack=new Stack<>();
        sol(stack, tempstack);
       while(!tempstack.isEmpty()){
            System.out.println(tempstack.pop());
        }
    }
}
