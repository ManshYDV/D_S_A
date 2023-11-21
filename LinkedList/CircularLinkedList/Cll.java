package LinkedList.CircularLinkedList;

public class Cll {

    private Node head;
    private Node tail;
    private int size;

    public Cll() {
        size = 0;
    }

//    public Cll() {
//        head = null;
//        tail = null;
//    }

    public void insertAfterTail(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        Node temp = head;
        if (head == null) {
            return;
        }
        if (temp.value == val) {
            head = temp.next;
            tail.next = head;
            return;
        }
        do {
            Node n = temp.next;
            if (n.value == val) {
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        } while (temp != head);
        {

        }

    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(" " + temp.value + "->");
                temp = temp.next;
            } while (temp != head);
            {

            }
        }
        System.out.println();

    }

    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
