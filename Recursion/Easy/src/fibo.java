public class fibo {

    private static int sol(int n){
        if(n<=1){
            return n;
        }
        return sol(n-1)+sol(n-2);
    }
    public static void main(String[] args) {
        int n=51;
        System.out.println(sol(n));
    }
}
