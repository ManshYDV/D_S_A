
public class SumlessTarget2824 {

    private static void sol(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] < target) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        // int[] arr = { -1, 1, 2, 3, 1 };
        int[] arr = { -6, 2, 5, -2, -7, -1, 3 };
        int target = -2;
        sol(arr, target);
    }
}
