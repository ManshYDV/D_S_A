package Strings.Easy;

import java.util.Stack;

public class RemoveOutermostParantheses {

    private static String sol(String str) {
        Stack<Character> stacks = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                if (stacks.size() > 0) {
                    sb.append(ch);
                }
                stacks.push(ch);
            } else {
                stacks.pop();
                if (stacks.size() > 0) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "((()))(())";
        System.out.println(sol(str));
    }
}
