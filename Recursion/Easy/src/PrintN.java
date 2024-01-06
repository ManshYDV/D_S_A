
public class PrintN {
    private static void sol(int n){
        if(n==0){
            return ;
        }
        sol(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=10;
        //System.out.println(sol(n));
        sol(n);
    }
}
