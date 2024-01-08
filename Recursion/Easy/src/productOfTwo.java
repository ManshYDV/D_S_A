public class productOfTwo {

    private static int sol(int x, int y){
        if( x < y) return sol(y, x);
        else if(y != 0) return x+sol(x,y-1);
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int x=5,y=2;
        System.out.println(sol(x,y));
    }
}
