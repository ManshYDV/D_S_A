
import java.util.Arrays;
import java.util.Random;

public class Insertion{

    private static void Insertion1(int number[]){
      for(int i=0;i<number.length-1;i++){
          for(int j=i+1;j>0;j--){
              if(number[j] < number[j-1]){
                  swap(number, j, j-1);
              }
              else{
                  break;
              }
          }
      }
    }
    private static void swap(int [] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args){
        Random ran=new Random();
        int [] number=new int[5];
        for(int i=0 ; i<number.length;i++){
            number[i]=ran.nextInt(20);
        }
        System.out.println("Before");
        for(int i: number){
            System.out.println(i);
        }
        Insertion1(number);
        System.out.println(Arrays.toString(number));
    }
}