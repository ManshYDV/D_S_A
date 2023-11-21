
import java.util.Random;

public class Insertion{

    private static void Insertion1(int number[]){
      for(int i=1;i<number.length;i++){   
        int temp=number[i];
        int j=i-1;
        while(j>=0 && number[j]>temp){
            number[j+1]=number[j];
            j--;
        }
        number[j+1]=temp;
      }
      System.out.println("After");
      for(int i : number){
       System.out.println(i);
      }
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
    }
}