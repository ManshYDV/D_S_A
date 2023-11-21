public class prime {

    private static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        int count=2;
        //sqrt of n
        while(count * count <=n){
            if(n % count == 0){
                return false;
            }
            count++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(37));
        for(int i=1;i<20;i++){
            System.out.println(i+" "+isPrime(i));
        }
    }
}
