import java.lang.reflect.Array;
import java.util.Arrays;

public class customStack {

    protected int[] data;
    private static final int MAX_SIZE=5;

    int stackPointer=-1;
public customStack(){
    this(MAX_SIZE);
}
    public customStack(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
  return stackPointer==data.length-1;
    }
    public boolean isEmpty(){
    return stackPointer==-1;
    }
    public boolean push(int item){
    if(isFull()){
        System.out.println("Stack is full");
        return false;
    }
    stackPointer++;
    data[stackPointer]=item;
    return true;

    }

public int pop() throws Exception{
    if(isEmpty()){
        throw new Exception("cannot pop a empty stack");
    }
//    int popedItem=data[stackPointer];
//    stackPointer--;
//    return popedItem;
    return data[stackPointer--];

}

public int peek() throws Exception{
    if(isEmpty()){
        throw new Exception("cannot peek from an empty stack");
    }
    return data[stackPointer];
}


    public static void main(String[] args)throws Exception {
//    customStack stack=new customStack(8);
//    stack.push(5);
//    stack.push(2);
////        System.out.println(stack.peek());
////        System.out.println(stack.pop());
//        stack.push(8);
//        stack.push(5);
//        stack.push(2);
//        stack.push(5);
//        stack.push(10);
//        System.out.println(stack.peek());
        customStack stack=new dynamicStack();
        stack.push(5);
        stack.push(2);
        stack.push(2);
        stack.push(5);
        stack.push(2);
        stack.push(5);
        stack.push(10);
        System.out.println(stack.peek());
    }
}
