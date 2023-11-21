public class findInMountainArray {


    private  static int search(int []arr, int target){
        int peakElement=peak(arr);
        int firstTry=orderAgnosticsBS(arr, target, 0, peakElement);
        if(firstTry != -1){
            return firstTry;
        }
               return orderAgnosticsBS(arr, target, peakElement+1, arr.length-1);
    }
    private  static int peak(int []arr ){
        int start=0, end=arr.length -1;
        while(start < end){
            int mid=start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }

    private  static int orderAgnosticsBS(int []arr, int target, int start, int end){


        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,5,4,3,1};
        int target=4;
       System.out.println(search(arr, target));
          }
}

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

//class Solution {
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int peak=peakElement(mountainArr);
//        if(mountainArr.get(peak)==target){
//            return peak;
//        }
//        int firstAns= orderAgnosticBS(mountainArr, target, 0, peak);
//        if(firstAns != -1){
//            return firstAns;
//        }
//        return  orderAgnosticBS(mountainArr, target, peak+1, mountainArr.length()-1);
//    }
//
//    private static int orderAgnosticBS(MountainArray mountainArr, int target, int start, int end){
//        boolean isAscending=mountainArr.get(start)<mountainArr.get(end);
//        while(start <= end){
//            int mid=start+(end-start)/2;
//            if(mountainArr.get(mid)==target){
//                return mid;
//            }
//            if(isAscending){
//                if(target < mountainArr.get(mid)){
//                    end=mid-1;
//                }
//                else{
//                    start=mid+1;
//                }
//            }
//            else{
//                if(target > mountainArr.get(mid)){
//                    end=mid-1;
//                }
//                else{
//                    start=mid+1;
//                }
//            }
//        }
//        return -1;
//    }
//
//    private static int peakElement(MountainArray mountainArr){
//
//        int start=0, end=mountainArr.length()-1;
//        while(start < end){
//            int mid=start +(end-start)/2;
//            if(mountainArr.get(mid) > mountainArr.get(mid+1)){
//                end=mid;
//            }
//            else{
//
//                start=mid+1;
//            }
//        }
//        return start;
//    }
//}