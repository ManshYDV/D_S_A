public class noOfDigits {
    public static void main(String[] args) {
        int n=10;
        int count=0;
        int base=2;
        int ans=(int)(Math.log(n)/Math.log(base))+1;
        System.out.println(ans);
        while(n > 0){
            n=n>>1;
            count++;
        }
        System.out.println(count);
    }
}
