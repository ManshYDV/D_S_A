public class reverseNum {

    static  int sum=0;
    private static void sol(int n) {
        if(n ==0){
            return ;
        }
        int rem=n%10;
        sum=sum*10+rem;
        sol(n/10);
    }


    private  static int rev2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem=n%10;
        return rem * (int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }

    private  static boolean palindrome(int n){
        return (n==rev2(n));
    }

//     private  static boolean pali(int n, int start, int end){
//
//        return (start==end) ? pali(n, start,end) : false;
//     }



    public static void main(String[] args) {
        int n=12321;
        sol(n);
        System.out.println(sum);
        System.out.println(rev2(123456));
        System.out.println(palindrome(n));
        //System.out.println(pali(n, 0, (int)(Math.log10(n))));

    }


}
