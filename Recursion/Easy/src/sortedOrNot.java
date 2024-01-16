public class sortedOrNot {

    private static boolean sol(int [] arr, int n, int index){
        if(index == n-1){
            return true;
        }
//        if(arr[index] > arr[index +1]) return false;
//        return sol(arr, n, index+1);
        return arr[index] < arr[index+1] && sol(arr,n,index + 1);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,5,6};
        System.out.println(sol(arr, arr.length, 0));
    }
}
