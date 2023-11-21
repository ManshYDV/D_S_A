import java.util.Arrays;

public class movezero {
                          // Time complexity O(n) and space complexity is O(1)
    private static void moveZero(int [] arr, int n){
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
           arr[i]=arr[j];
           i++;
            }
        }
       for(;i<n;i++){
        arr[i]=0;
       }
        
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr={0,1,2,3,0,4,};
        int n=arr.length;
        moveZero(arr,n);
    }
}
