public class isSorted {
// TC is o(n) and space is O(1)
    private static Boolean IsSort(int [] arr, int n){
        for(int i=1;i<n;i++){
            if(arr[i]< arr[i-1]){
                return false;
            }
           
        }
          return true;
    }
    public static void main(String[] args){
        int [] arr={1,2,3,3,4,5,6,1};
        int n=arr.length;
       System.out.println( IsSort(arr,n));
    }
}
