import java.util.ArrayDeque;
import java.util.Deque;

public class stackUsingQueue {

    Deque<Integer> deck;
    public stackUsingQueue(){
deck=new ArrayDeque<>();
    }
    public void push(int x){
deck.addLast(x);
    }

    public int pop(){
        if(empty()){
            return -1;
        }
    return deck.removeLast();
    }

    public int top(){
    return deck.getLast();
    }

    public boolean empty(){
        return deck.isEmpty();
    }
    public static void main(String[] args) {
       stackUsingQueue obj=new stackUsingQueue();
        System.out.println(obj.empty());
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println(obj.top());

    }
}
