import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset {
    //n*n2^n tc
    private static List<List<Integer>> sol(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    private static List<List<Integer>> dupSol(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int size = outer.size();
            for (int j = start; j < size; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3};
//        List<List<Integer>> ans = sol(arr);
//        System.out.println(ans);
        int[] arr1 = {1, 2, 2};
        List<List<Integer>> ans1 = dupSol(arr1);
        System.out.println(ans1);
    }
}
