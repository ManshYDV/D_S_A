package Strings.Easy;

public class ShortestPath {

    private static float sol(String path) {
        int low = 0;
        int x = 0, y = 0;
        int high = path.length() - 1;
        while (low <= high) {
            if (path.charAt(low) == 'E') {
                y++;
                low++;
            } else if (path.charAt(low) == 'W') {
                y--;
                low++;
            } else if (path.charAt(low) == 'N') {
                x++;
                low++;
            } else {
                x--;
                low++;
            }
        }

        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        double ans = sol(path);

        System.out.println(ans);
    }
}
