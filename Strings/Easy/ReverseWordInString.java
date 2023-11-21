package Strings.Easy;

import java.util.Stack;

public class ReverseWordInString {

    private static String sol(String words) {
        // words += " ";
        // Stack<String> st = new Stack<>();
        // String str = "";
        // for (int i = 0; i < words.length(); i++) {
        // if (words.charAt(i) == ' ') {
        // st.push(str);
        // str = "";
        // } else {
        // str += words.charAt(i);
        // }
        // }
        // String ans = "";
        // while (st.size() != 0) {
        // ans += st.peek() + " ";
        // st.pop();
        // }
        // return ans;

        // int left = words.length() - 2, right = words.length() - 1;
        // String ans = "";
        // while (left >= 0) {
        // if (words.charAt(left) == ' ') {
        // ans += words.substring(left, right + 1);
        // right = left - 1;
        // left--;
        // } else {
        // left--;
        // }
        // if (left == 0 && words.charAt(left) != ' ') {
        // ans += " " + words.substring(left, right + 1);
        // }
        // }
        // return ans;
        String[] str = words.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i] + " ");
        }
        return sb.toString().trim();

    }

    public static void main(String[] args) {
        String words = "The sky is blue ";
        System.out.println(sol(words));
    }
}
