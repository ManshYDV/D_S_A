public class CirQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CirQueue() {
        this(DEFAULT_SIZE);
    }

    public CirQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end %= data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is already empty");
        }
        int removedItem = data[front++];
        front %= data.length;
        size--;
        return removedItem;
    }

    public int fornt() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty nothing to display");
        }
        return data[front];
    }

    public void display() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty nothing to display");
        }
        int i = front;
        do {
            System.out.print(data[i] + "->");
            i++;
            i %= data.length;
        }
        while (i != end);
        System.out.println("End");
    }

    public static void main(String[] args) throws Exception{
        CirQueue circularQueue=new CirQueue(5);
        circularQueue.insert(5);
        circularQueue.insert(4);
        circularQueue.insert(3);
        circularQueue.insert(2);
        circularQueue.insert(1);
        circularQueue.display();
        circularQueue.remove();
        circularQueue.insert(144);
        circularQueue.display();

    }
}
