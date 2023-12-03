public class customQueue {
    private int []data;
    private static final int  MAX_SIZE=10;
    int end=0;

    private customQueue(){
        this(MAX_SIZE);
    }
    public customQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return end==data.length;
    }
    public boolean isEmpty(){
        return end==0;
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
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removedItem;
    }
    public int start() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is already empty");
        }
        return data[0];
    }
    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        for(int i=0;i<end;i++){
            System.out.println(data[i]);
        }
        System.out.println("End");
    }

    public static void main(String[] args) throws Exception{
        customQueue queue=new customQueue();
        queue.insert(15);
        queue.insert(20);
        queue.insert(25);
        queue.display();
        queue.remove();
        queue.display();
    }
}
