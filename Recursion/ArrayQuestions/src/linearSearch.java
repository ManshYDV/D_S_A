public class linearSearch {
    public static void main(String[] args) {
    int [] arr={1,5,8,9,4,7};
        System.out.println(sol(arr, 7, 0));

    }

    private static boolean sol(int[] arr, int target, int index) {
        if(index == arr.length-1){
            return false;
        }
        return (arr[index]==target) || sol(arr, target, index+1);
    }
}
