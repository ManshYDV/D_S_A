package Strings.Easy;

public class LongestCommonPrefi {

    private static String sol(String[] strs) {
        if (strs.length == 0)
            return "";
        StringBuilder longest = new StringBuilder(strs[0]);
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(longest.toString()) != 0) {
                longest.setLength(longest.length() - 1);
            }
        }
        return longest.toString();
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(sol(strs));
    }
}
