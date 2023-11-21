import java.net.StandardSocketOptions;

public class ithNumber {
    public static void main(String[] args) {
        int number =23;
        int i=5;
        int mask= 1 <<i-1;
        System.out.println((number & mask)>>i-1);

        //set the ith bit
        System.out.println(number | mask-1 );

        // reset the ith bit
        int cmask=~(1 <<i-1);
        System.out.println(number & cmask);
    }
}
