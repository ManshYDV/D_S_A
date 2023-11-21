import java.util.Random;
import java.util.Arrays;

public class QuickSort {

    private static void QuickS(int [] arr, int si, int li){
        if(si>=li) return;
        int pidx=partition(arr, si, li);
        QuickS(arr, si, pidx-1);  //left side
        QuickS(arr, pidx+1, li); //right side
    }
    private static int partition(int [] arr, int si, int li){
        int pivot=arr[li];
        int i=si-1;  //to make place for smaller elements than pivot
        for(int j=si;j<li;j++){
            if(arr[j]<=pivot){
                i++;
                int temp =arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[li]=arr[i];
        arr[i]=temp;
        return i;
    }
    private static void printQuick(int [] arr){
        System.out.println("After");
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int [] arr=new int[5];
        Random rc=new Random(0);
        for(int i=0;i<arr.length;i++){
            arr[i]=rc.nextInt(20);
        }
        System.out.println("Before\n" + Arrays.toString(arr));
        QuickS(arr, 0 , arr.length-1);
        printQuick(arr);
    }
}
