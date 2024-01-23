public class DStack extends CStack{

    public DStack(){
        super(); //it will call CStack()
    }

    public DStack(int size){
        super(size); //it will call CStack(int size)
    }

    @Override
    public boolean push(int item) {
      if(this.isFull()){
          //double the size
          int [] temp=new int[data.length * 2];
//          for(int i=0;i<data.length;i++){
//              temp[i]=data[i];
//          }
          System.arraycopy(data, 0, temp, 0, data.length);
          data=temp;
      }
      return super.push(item);
    }
}
