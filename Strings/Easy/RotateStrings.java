package Strings.Easy;

public class RotateStrings {

    private static boolean sol(String s, String goal) {
        return (s.length() == goal.length() && (s + s).contains(goal));

    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdesb";
        System.out.println(sol(s, goal));
    }
}
