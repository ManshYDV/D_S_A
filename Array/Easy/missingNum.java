public class missingNum {

    // also the summation of given array - summation of n
    private static int findmiss(int[] arr, int n) {
        int j = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != j)
                break;
            else
                j++;
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int size = arr.length;
        int m = findmiss(arr, size);
        if (m > size) {
            System.out.println("No missing element found ");
        } else {
            System.out.println("The missing element is " + m);
        }
    }
}
// int sum = (N * (N + 1)) / 2;

// //Summation of all array elements:
// int s2 = 0;
// for (int i = 0; i < N - 1; i++) {
// s2 += a[i];
// }

// int missingNum = sum - s2;
// return missingNum;

// with less space
// class Solution {
// public int missingNumber(int[] nums) {
// // int size=nums.length;
// int n=nums.length*(nums.length+1)/2;
// int sum=0;
// for(int i=0;i<=nums.length-1;i++){
// sum+=nums[i];
// }
// return n-sum;
// }
// }