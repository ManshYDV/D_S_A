public class ConsecutiveOnes {

    private static int Ones(int[] arr, int size) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 1 && arr[i] != 0) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }

        }
        return max = Math.max(max, count);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 };
        int size = arr.length;
        int element = Ones(arr, size);
        System.out.println(element);

    }
}
