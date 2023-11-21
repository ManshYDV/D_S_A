
public class removeDuplicates {
    // time complexity O(n) and space complexity O(1)
    public static int remDup(int[] arr, int n) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {

                arr[++i] = arr[j];
            }
        }
        return i + 1;
    }
    // public static void remDup(int arr[] , int n){
    // int j=0;
    // for(int i=1;i<n;i++){
    // if(arr[i]==arr[j]){
    // continue;
    // }
    // else{

    // arr[++j] =arr[i]; // i=i+1 i+1=i
    // }
    // }
    // for(int i=0;i<=j;i++){
    // System.out.println(arr[i]);
    // }
    // }
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 2 };
        int size = arr.length;
        int c = remDup(arr, size);
        for (int i = 0; i < c; i++) {
            System.out.println(arr[i]);
        }

    }
}