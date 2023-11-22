import java.util.Arrays;

public class selectionSort {
    private static void sol(int []arr, int i, int j, int max){
        if(i==0){
            return;
        }
        if(j<i){
            if(arr[j] > arr[max]){
                sol(arr, i,j-1, j);
            }
            else{
                sol(arr, i, j+1, max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[i-1];
            arr[i-1]=temp;
            sol(arr, i-1,0,0);
        }
    }

    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
    sol(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
