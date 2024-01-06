public class minAndMax {

    private static int min(int [] arr, int n){
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1], min(arr,n-1));
    }
    private static int max(int [] arr, int n){
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n-1], n-1);
    }
    public static void main(String[] args) {
        int [] arr={1,3,5,9,0,-50};
        System.out.println(min(arr, arr.length));
        System.out.println(max(arr, arr.length));
    }
}
