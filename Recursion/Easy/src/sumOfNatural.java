public class sumOfNatural {

    private static int sol(int n){
        if(n <= 1){
            return n;
        }
        return n+sol(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sol(n));
    }
}
