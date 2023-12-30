
import java.util.Arrays;
import java.util.Random;

public class Selection {

    private static void Sel(int [] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=max(arr, 0, last);
            swap(arr,  maxIndex, last);
        }
    }

    private static void swap(int [] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    private static int max(int []arr, int start, int last){
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[i] > arr[max]){
                max=i;
            }
        }
        return max;
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
        System.out.println(Arrays.toString(arr));
    }
}

