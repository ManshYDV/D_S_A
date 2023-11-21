package Array.Medium;

public class MajorityElementnByTwoTimes {

    private static int sol(int[] arr) {
        int element = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count++;
                element = arr[i];
            } else if (arr[i] == element) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 4, 2, 4, 3, 4, 4, 3, 2, 4 };
        int ans = sol(arr);
        System.out.println(ans);
    }
}
