import java.util.ArrayList;

public class factorial {

    private static int fact1(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i);
            }
        }
        return -1;
    }

    private static void fact2(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i * i < n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " " );
                } else {
                    System.out.print(" "+i );
                    list.add(n/i);
                }
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(" "+list.get(i));
        }

    }
    public static void main(String[] args) {
     fact2(20);
      //  System.out.println(fact1(40));
    }
}
