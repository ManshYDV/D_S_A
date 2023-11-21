public class KadanesMaxSubarray {

    private static void Kadanes(int[] arr) {
        int MS = Integer.MIN_VALUE;
        int currSum = 0;
        int start = 0;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i < arr.length; i++) {
            if (currSum == 0)
                start = i;
            currSum += arr[i];
            if (currSum < 0) { // in this we actually replace cursum with 0 if its negative
                currSum = 0;
            }
            MS = Math.max(currSum, MS);
            ansStart = start;
            ansEnd = i;
        }
        System.out.println("Max no of subarray is " + MS);
        for (int i = ansStart; i < ansEnd; i++) {
            System.out.print("[" + arr[i] + "]" + " ,");
        }
    }

    public static void main(String[] args) {
        // int[] arr = { -1, -2, 5, -8, 9, 3, -1 };
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        Kadanes(arr);
    }
}
