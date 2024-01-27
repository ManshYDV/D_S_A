public class CQueue {

    private int [] data;
    private static final int DEFAULT_SIZE=10;
    int end=0;

    public CQueue(){
        this(DEFAULT_SIZE);
    }
    public CQueue(int size){
        this.data=new int[size];
    }

    public boolean insert(int item) {
        if(isFull()){
            return false;
        }
    data[end++]=item;
        return true;
    }

    public int remove()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is already empty");
        }
        int removedItem=data[0];

        for(int i=1;i< end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removedItem;
    }

    public int fornt() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty nothing to display");
        }
        return data[0];
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty nothing to display");
        }
        for (int i=0;i<end;i++){
            System.out.print(data[i] +"<=");
        }
        System.out.println("End");
    }
    public boolean isFull() {
        return end==data.length;
    }

    public boolean isEmpty(){
        return end==0;
    }

    public static void main(String[] args) throws Exception {
        CQueue queue=new CQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();
        queue.remove();
        queue.display();
    }

}
