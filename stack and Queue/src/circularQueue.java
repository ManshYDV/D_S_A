public class circularQueue {
    protected int []data;
    private static final int  MAX_SIZE=5;
    int end=0;
    int front=0;
    int size=0;
    circularQueue(){
        this(MAX_SIZE);
    }
    public circularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return size ==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is already empty");
        }
        int removedItem=data[front++];
        front=front%data.length;
        size--;
        return removedItem;

    }

    public int frontItem() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is already empty");
        }
        return data[front];
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is already empty");
        }
//        for(int i=front;i<end;i++){
//            System.out.println(data[i]);
//        }
        int i=front;
        do {
            System.out.println(data[i]);
            i++;
            i%=data.length;
        }
        while (i != end);
        System.out.println("End");
    }

    public static void main(String[] args) throws Exception {
        circularQueue queue=new dynamicQueue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        queue.display();
        queue.remove();
        queue.insert(6);
        queue.insert(6); queue.insert(6); queue.insert(6);
        queue.display();
    }

}
