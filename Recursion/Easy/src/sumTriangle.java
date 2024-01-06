import java.util.Arrays;

public class sumTriangle {

    private static void sol(int[] arr) {
        if (arr.length < 1) {
            return;
        }
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < arr.length-1; i++) {
            int x=arr[i]+arr[i+1];
            temp[i]=x;
        }
        sol(temp);
        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sol(arr);
        System.out.println(Arrays.toString(arr));

    }
}
