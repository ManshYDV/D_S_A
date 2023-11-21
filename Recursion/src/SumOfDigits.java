public class SumOfDigits {
    public static void main(String[] args) {
        int n=1372;
        System.out.println(sol(n));
        System.out.println(prod(n));
    }

    private static int prod(int n) {
        if(n==0){
            return 1;
        }
        return n%10 * prod(n/10);
    }

    private static int sol(int n) {
        if(n==0){
            return 0;
        }

        return n%10+sol(n/10);
    }
}
