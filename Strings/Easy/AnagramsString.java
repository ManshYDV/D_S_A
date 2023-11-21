package Strings.Easy;

public class AnagramsString {

    private static boolean sol(String a, String b) {
        if (a.length() != b.length())
            return false;
        int[] arr = new int[26];
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a']++;
            arr[b.charAt(i) - 'a']--;
        }
        for (int counts : arr) {
            if (counts != 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        String a = "cat";
        String b = "act";

        System.out.println(sol(a, b));

    }
}
