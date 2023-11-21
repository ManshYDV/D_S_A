public class sortedArray {

    private static boolean sol(int []arr, int index){
        if(index==arr.length-1){
            return true;
        }
        return (arr[index]<arr[index+1]) && sol(arr, index+1);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,8,6};
        System.out.println(sol(arr,0));
    }
}
