public class skipChar {

    private static void sol(String newStr, String str) {
        if (str.isEmpty()) {
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            sol(newStr, str.substring(1));
        } else {
            sol(newStr + ch, str.substring(1));
        }
    }

    private static String sol(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            return sol(str.substring(1));
        } else {
            return ch + sol(str.substring(1));
        }
    }

    public static void main(String[] args) {
        sol("", "manish");
        System.out.println(sol("bada"));
     }
}
