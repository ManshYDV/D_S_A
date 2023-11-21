package LinkedList.SinglyLinkedList;

import LinkedList.DoublyLinkedList.DoublyLL;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null)
            insertFirst(val);
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtPos(int val, int pos) {
        if (pos == 0) {
            insertFirst(val);
            return;
        }
        if (pos == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node sLast = get(size - 2);
        int val = tail.value;
        tail = sLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteAtPos(int pos) {
        if (pos == 0) {
            return deleteFirst();
        }
        if (pos == size - 1) {
            return deleteLast();
        }
        Node prev = get(pos - 1);

        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public int findValue(int val) {
        Node node = head;
        int size = 0;
        while (node != null) {

            if (node.value == val) {
                return size;
            }
            size++;
            node = node.next;
        }
        return -1;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.insertFirst(0);
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertLast(8);
        linkedList.insertAtPos(10, 4);
        // linkedList.display();
        // System.out.println(linkedList.deleteFirst());
        // linkedList.display();
        // System.out.println(linkedList.deleteAtPos(2));
        // System.out.println(linkedList.deleteLast());
        // linkedList.display();
        // System.out.println(linkedList.findValue(0));
        // System.out.println(linkedList.size);
        DoublyLL dl = new DoublyLL();
        dl.insertFirst(0);
        dl.insertFirst(1);
        dl.insertFirst(2);
        dl.insertFirst(3);
        dl.insertLast(99);
        dl.insertAfter(2, 110);
        dl.display();
        System.out.println(DoublyLL.size);
    }
}

// class Node {
// private int data;
// private Node next;

// public Node() {

// }

// public Node(int data, Node next) {
// this.data = data;
// this.next = next;
// }

// public void setData(int data) {
// this.data = data;
// }

// public void setNext(Node next) {
// this.next = next;
// }

// public int getData() {
// return data;
// }

// public Node getNext() {
// return next;
// }
// }

// class LinkedList {
// private int size;
// private Node start;

// public LinkedList() {

// }

// public LinkedList(int size, Node start) {

// }

// public boolean isEmpty() {
// if (start == null)
// return true;
// else
// return false;
// }

// public int getSize() {
// return size;
// }

// public void viewList() {
// if (isEmpty())
// System.out.println("LinkedList is empty");
// Node temp = start;
// while (temp != null) {
// System.out.println(" " + temp.getData() + " ->");
// temp = temp.getNext();
// }
// System.out.println("End");
// }
// public void insertAtFirst(int data){
// Node node=new Node();
// node.setData(data);
// node.setNext(start);
// size++;
// }
// }

// public class LL {
// public static void main(String[] args) {
// LinkedList l1 = new LinkedList();
// System.out.println(l1.getSize());
// }
// }