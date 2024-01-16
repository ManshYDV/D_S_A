public class ReverseDigit {

    private static int sol(int n){
        if(n%10==n){
            return n;
        }
        return  ((n % 10) * (int) Math.pow(10, (int)Math.log10(n))) + (sol(n/10));

    }
    public static void main(String[] args) {

        System.out.println(sol(1234));
        int n=1234;
        System.out.println((int)Math.log10(n)+1);
    }
}
