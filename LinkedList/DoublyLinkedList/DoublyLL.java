package LinkedList.DoublyLinkedList;

public class DoublyLL {

    private Node head;
    public static int size;

    public DoublyLL() {
        size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null) {
            node.prev = null;
            node = head;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        size++;

    }

    public void insertAfter(int after, int val) {
        Node temp = find(after);
        if (temp == null) {
            System.out.println("Node doesn't exists");

            return;
        }
        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        if (node.next != null) {
            node.next.prev = node;
        }

    }

    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        System.out.print("Start <-->");
        while (temp != null) {
            System.out.print(" " + temp.value + " <-->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");
        System.out.print("End <-->");
        while (last != null) {
            System.out.print(" " + last.value + " <-->");
            last = last.prev;
        }
        System.out.println("Start");
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
