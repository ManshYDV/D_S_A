public class CStack {

    protected int [] data;
    private static int DEFAULT_SIZE=10;

    int sp=-1;
    public CStack(){
        this(DEFAULT_SIZE);
    }
    public CStack(int size){
        this.data=new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        sp++;
        data[sp]=item;
        return true;
       // return data[sp--];
    }

    public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek an empty stack");
        }
        return data[sp];
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop an empty stack");
        }
        int removedItem=data[sp];
        sp--;
        return removedItem;
    }

    public boolean isFull() {
        return sp==data.length-1;
    }

    public boolean isEmpty(){
        return sp==-1;
    }

    public static void main(String[] args) throws Exception {
  //  CStack stack=new CStack(5);
        DStack stack=new DStack(5);
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);
    stack.push(60);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
