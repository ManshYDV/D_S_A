package BinarSrch.BSon1D;

public class MinimumRotatedSortedArray {

    private static void sol(int[] arr) {
        int minElement = Integer.MAX_VALUE;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[low] <= arr[mid]) {
                minElement = Math.min(arr[low], minElement);
                low = mid + 1;
            } else {
                minElement = Math.min(minElement, arr[mid]);
                high = mid - 1;
            }
        }
        System.out.println(minElement);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2, 3 };
        sol(arr);
    }
}

// further optimized
// while(low<=high){
// int mid=low+(high-low)/2;
// if(nums[low]<=nums[high]){
// ans=Math.min(ans,nums[low]);
// break;
// }
// if(nums[low]<=nums[mid]){
// ans=Math.min(ans, nums[low]);
// low=mid+1;
// }
// else{
// ans=Math.min(ans,nums[mid]);
// high=mid-1;
// }
// }