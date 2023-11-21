package Strings.Easy;

public class LargestOddNumber {

    private static String sol(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int currentDigit = ch - '0';
            if (currentDigit % 2 == 1) {
                return str.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String str = "21211";
        System.out.println(sol(str));
    }
}
