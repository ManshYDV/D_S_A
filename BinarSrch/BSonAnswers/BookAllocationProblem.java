package BinarSrch.BSonAnswers;

public class BookAllocationProblem {

    private static int sol(int[] arr, int students) {
        int low = 1, high = 0;
        for (int i = 0; i < arr.length; i++) {
            high += arr[i];
            low = Math.max(arr[i], low);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int std = countStd(arr, mid);
            if (std > students) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return low;
    }

    private static int countStd(int[] arr, int mid) {

        int students = 1;
        long pages = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= mid) {
                pages += arr[i];
            } else {
                students++;
                pages = arr[i];
            }
        }
        return students;
    }

    public static void main(String[] args) {
        int[] arr = { 25, 46, 28, 49, 24 };
        int students = 4;
        System.out.println(sol(arr, students));
    }
}
