

import java.util.Arrays;
import java.util.Random;

public class Bubble {

    private static void Buble(int []arr ){

        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=1; j<arr.length-i-1;j++){
             if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
             }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println("After");
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        int []arr=new int[5];
        Random ran=new Random(0);
        for(int i=0;i<arr.length;i++){
            arr[i]=ran.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Before");
        for(int i:arr){
            System.out.println(i);
        }
        Buble(arr);
    }
}
