public class checkPrime {

    private static boolean sol(int n, int i){
        if(n <= 2){
            return n==2?true : false;
        }
        if(n%i==0) return false;
        if(i * i >n) return true;
        return sol(n, i+1);
    }
    public static void main(String[] args) {
        int n=51;
        System.out.println(sol(n,2));
    }
}
