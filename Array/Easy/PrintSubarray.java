public class PrintSubarray {

    private static void SubArray(int[] arr) {
        int sum = 1;
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            for (int j = i; j < arr.length; j++) {
                curSum = 0;
                for (int k = i; k <= j; k++) {
                    // System.out.print(arr[k] + " ");
                    // sum = sum + k;
                    curSum += arr[k];
                }
                // System.out.println("The sum of current subarray is " + i * (i + 1) / 2);
                // System.out.println();
                System.out.println("Sum of " + i + " and " + j + " subarray " + curSum);
                if (maxSum < curSum) {
                    maxSum = curSum;
                } else if (minSum > curSum) {
                    minSum = curSum;
                }

            }

        }
        System.out.println("max sum of subarray is " + maxSum);
        System.out.println("min sum of subarray is " + minSum);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, -5, 4, 5 };

        System.out.println("The lenght of subarray is going to be " + arr.length * (arr.length - 1) / 2);
        SubArray(arr);
    }
}
