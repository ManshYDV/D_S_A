public class countZeroes {

    private static int counto(int n, int count) {
        if(n==0){
            return count;
        }
        int rem=n%10;
//        if(rem==0){
//            return counto(n/10,count+1);
//        }
//        return counto(n/10,count);
        return (rem==0)?counto(n/10,count+1) : counto(n/10,count);
    }
    public static void main(String[] args) {
        int n= 1020101;

        System.out.println(counto(n, 0));
    }


}
