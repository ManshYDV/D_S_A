import java.util.Arrays;

public class seiveOfErasthones {

    private static void seive(int n, boolean [] prime) {
        for(int i=2;i*i<=n;i++){
            if(!prime[i]){
                for(int j=i*2;j<=n;j+=i){
                    prime[j]=true;
                }
            }
        }
        for(int i=1;i<=20;i++){
            if(!prime[i]) {
                System.out.println(i + " " + prime[i]);
            }
        }
    }
//n*log(logn)
    public static void main(String[] args) {
        int n=40;
        boolean [] prime=new boolean[n+1];
        seive(n , prime);
          }


}
