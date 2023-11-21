package LinkedList.CircularLinkedList;

public class main {
    public static void main(String[] args) {
        Cll ll = new Cll();
        ll.insertAfterTail(0);
        ll.insertAfterTail(1);
        ll.insertAfterTail(2);
        ll.insertAfterTail(3);

        ll.display();
        ll.delete(2);
        ll.display();
    }
}
