import java.util.ArrayList;

public class StackUsingALandLL {

    static class stackAl{
        static ArrayList<Integer> stack=new ArrayList<>();
        public static boolean isEmpty(){
            return  stack.size()==0;
        }
        public static void push(int data){
            stack.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
           int top= stack.remove(stack.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return stack.get(stack.size()-1);
        }

    }

    public static void main(String[] args) {
    nodeLL s=new nodeLL();
    s.push(1);
    s.push(2);
    s.push(3);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        static class nodeLL{
            static Node head=null;
            public static boolean isEmpty(){
                return head==null;
            }
            public static void push(int data){
                Node newNode=new Node(data);
                if(isEmpty()){
                    head=newNode;
                }
                newNode.next=head;
                head=newNode;
            }
            public static int pop(){
                if(isEmpty()){
                    return -1;
                }
                int removedNode=head.data;
                head=head.next;
                return removedNode;
            }
            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }

    }
}
