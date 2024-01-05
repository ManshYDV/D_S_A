import java.util.Arrays;

public class CycleSort {

private static void sort(int [] arr){
    int i=0,n= arr.length;
    while( i < n){
        int idx=arr[i]-1;
        if(arr[i] != arr[idx]){
            swap(arr, i, idx);
        }
        else{
            i++;
        }
    }
}

private static void swap(int [] arr, int first, int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}

    public static void main(String[] args) {
        int [] arr={1,2,0};
        System.out.println(arr.length);
       // sort(arr);
        //System.out.println(Arrays.toString(arr));
    }
}
