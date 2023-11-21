
public class FindUnion {

    private static void Distinct(int[] arr1, int[] arr2, int m, int n) {
        // Set<Integer> sets = new HashSet<>(); //TC is O(m+n)Olog(m+n) and SC is O(m+n)
        // ArrayList<Integer> al = new ArrayList<>();
        // for (int i = 0; i < m; i++) {
        // sets.add(arr1[i]);
        // }
        // for (int i = 0; i < n; i++) {
        // sets.add(arr2[i]);
        // }
        // for (int it : sets) {
        // al.add(it);
        // }
        // System.out.println(al);
        int x = 0;
        int y = 0;
        while (x < m && y < n) {
            if (arr1[x] < arr2[y]) {
                System.out.println(arr1[x] + " ");
                x++;
            } else if (arr2[y] < arr1[x]) {
                System.out.println(arr2[y] + " ");
                y++;
            } else {
                System.out.println(arr2[y] + " ");
                x++;
                y++;
            }
        }
        while (x < m) {
            System.out.println(arr1[x] + " ");
            x++;
        }
        while (y < n) {
            System.out.println(arr2[y] + " ");
            y++;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int m = arr1.length;
        int[] arr2 = { 1, 4, 5, 6 };
        int n = arr2.length;
        Distinct(arr1, arr2, m, n);
    }
}
