package BinarSrch.BSon1D;

public class HowManyTimesArrayRotated {

    private static int sol(int[] arr) {
//        int low = 0, high = arr.length - 1;
//        int idx = -1;
//         while (low < high) {
//         int mid = low + (high - low) / 2;
//         if (arr[low] <= arr[mid]) {
//         idx = low;
//         low = mid + 1;
//         } else {
//         idx = mid;
//         high = mid - 1;
//         }
//         }
//         System.out.println(idx);
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            if (arr[mid] > arr[high]) {
//                low = mid + 1;
//            } else if (arr[mid] > arr[low]) {
//                high = mid - 1;
//            } else {
//                high--;
//            }
//        }
       // System.out.println(low);
        int start=0,end= arr.length-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid+1;
            }
            else if(mid > start && arr[mid] < arr[mid-1] ){
                return mid-1+1;
            }
            else if(arr[mid] <= arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3,3,3,4,2,3 };
       System.out.println( sol(arr));
       System.out.println(duplicatesValue(arr));
    }

    private static int duplicatesValue(int[] arr) {
        int start=0,end= arr.length-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                end--;
                start++;
                continue;
            }
            else if(mid < end && arr[mid] > arr[mid+1]){
                return mid+1;
            }
            else if(mid > start && arr[mid] < arr[mid-1]){
                return mid;
            }
            else if(arr[mid] < arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return  -1;
    }
    

}
