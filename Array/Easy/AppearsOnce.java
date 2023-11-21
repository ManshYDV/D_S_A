package Array.Easy;

public class AppearsOnce {

    private static int Once(int[] arr, int size) {
        int xor = 0;
        for (int i = 0; i < size; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
        // HashMap<Integer, Integer> num = new HashMap<>();
        // for (int i = 0; i < size; i++) {
        // if (num.containsKey(arr[i])) {
        // num.put(arr[i], num.get(arr[i]) + 1);
        // } else {
        // num.put(arr[i], 1);
        // }
        // }
        // System.out.println(num);
        // if (num.containsValue(1))
        // return num.get();

        // else
        // return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 1, 1, 2, 5, 5 };
        int size = arr.length;
        int element = Once(arr, size);
        System.out.println(element);
        // if (element != -1) {
        // System.out.println(element);
        // } else {
        // System.out.println("Every element is repeated twice or more than twice");
        // }
    }
}
