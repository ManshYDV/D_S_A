public class powerOfTwo {
    public static void main(String[] args) {
        int n=64;
        int count=0;
        while(n>0){
            n=n>>1;
            count++;
        }
        System.out.println("its a power of 2^"+count);
        if((n&(n-1))==0){
            System.out.println("Its a power of two");
        }
        else System.out.println("It's not a power of two");
    }
}
