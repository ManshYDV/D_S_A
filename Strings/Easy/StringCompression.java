package Strings.Easy;

public class StringCompression {

    private static String sol(String str) {
        if (str.isEmpty() || str == null) {
            return "Empty String";
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                if (count > 1) {
                    sb.append(count);
                    count = 1;
                }
            }
        }
        // sb.append(str.charAt(str.length() - 1)).append(count);
        return sb.isEmpty() ? str : sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaabbbccdd";
        System.out.println(sol(str));
    }
}
