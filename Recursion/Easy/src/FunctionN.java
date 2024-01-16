public class FunctionN {

    private static double solIterator(int a, int x){
        if(x==0) return 1;
        if(x < 0 || x == 1) return a;
        double result=1;
        for(int i=1;i<=x;i++){
            result*=a;
        }
        return (long) result;
    }

    private static long recuSol(int a, int x){
        if(x==0) return 1;
        return a * recuSol(a, x-1);
    }
    public static void main(String[] args) {
        int a=10,x=10;
        System.out.println(solIterator(a, x));
        System.out.println(recuSol(10,10));
    }
}
