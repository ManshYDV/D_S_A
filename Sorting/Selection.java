
import java.util.Arrays;
import java.util.Random;

public class Selection {
    private static void swap(int [] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    private static void Sel(int [] arr){  //1023
        int lenght=arr.length;
        for(int i=0;i<lenght-1;i++){
            int smallest=arr[i];
            int indexMin=i;
            for(int j=i+1;j<lenght;j++){
            if(arr[j]<smallest){
                smallest=arr[j];
             indexMin=j;
            }
            }
            swap(arr, i, indexMin);
        }
        System.out.println(Arrays.toString(arr));
    } 
    public static void main(String[] args){
        int []arr =new int[5];
        Random ran=new Random(0);
        for(int i=0;i<arr.length;i++){
            arr[i]=ran.nextInt(5);
        }
    System.out.println("Before");
    for(int i: arr){
        System.out.println(i);
    }
    Sel(arr);
    }
}

