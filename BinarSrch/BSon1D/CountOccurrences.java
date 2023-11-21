package BinarSrch.BSon1D;

public class CountOccurrences {
    private static void Count(int[] arr, int size, int x) {
        int count = 0;
        while (size >= 0) {
            if (arr[size] == x) {
                count++;
            }
            size--;
        }
        System.out.println("number of times " + x + "  has occured " + count + " times");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 2, 2, 3, 3, 3, 1, 1, };
        int x = 1;
        int size = arr.length;
        Count(arr, size - 1, x);
    }

}
