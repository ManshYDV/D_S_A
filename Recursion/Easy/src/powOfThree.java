public class powOfThree {

    private static boolean sol(int n){
        if(n==1){
            return true;
        }
        if(n==1 || n%3!=0) return false;
        return sol(n/3);
    }
    public static void main(String[] args) {
        int n=2147483647;
        System.out.println(sol(n));
    }
}
