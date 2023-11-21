public class Fibonacci {
    private static int sol(int n){
        if(n<=1){
            return n;
        }
        return sol(n-1)+sol(n-2);
    }

    private  static void numPrint(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        numPrint(n-1);
        System.out.println(n);
    }

    private static long nthFormula(int n){
      // return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
        //return (int)((Math.pow(((1 +Math.sqrt(5)) /2), n)/Math.sqrt(5));
        return (long)(Math.pow(((1 +Math.sqrt(5)) /2), n)/Math.sqrt(5));
    }

    public static void main(String[] args) {
        int n=5;
        //System.out.println(sol(n));
        numPrint(n);
//        for(int i=0;i<11;i++){
//            System.out.println(nthFormula(i));
//    }
        System.out.println(nthFormula(56));
}
}
