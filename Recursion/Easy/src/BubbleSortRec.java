import java.util.Arrays;

public class BubbleSortRec {

    private static void sol(int [] arr, int n){
        if(n==1) return ;
        int count=0;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                count++;
            }
        }
        if(count==0) return;
        sol(arr, n-1);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3};
        sol(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
