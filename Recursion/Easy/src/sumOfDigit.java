public class sumOfDigit {

    private static int sol(int n){
        if(n==0) return 0;
        return (n%10+sol(n/10));
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println(sol(n));
    }
}
