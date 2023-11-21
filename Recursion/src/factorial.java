public class factorial {
    public static void main(String[] args) {
        System.out.println(sol(5));

    }

    private static int sol(int n) {
        if(n==1){
            return 1;
        }
        return n *sol(n-1);
    }
}
