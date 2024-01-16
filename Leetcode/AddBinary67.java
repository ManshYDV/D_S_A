public class AddBinary67 {
    private static String  sol(String a, String b){
        int x=Integer.parseInt(a);
        int y=Integer.parseInt(b);
        int ans=0;
        int power=0;
        while(x > 0 || y >0){
        int lastDigit= x % 10;
        ans+=lastDigit*Math.pow(2,power);
        x/=10;
        lastDigit=y % 10;
        ans+=lastDigit*Math.pow(2,power);
        y/=10;
        power++;
        }
        return Integer.toBinaryString(ans);
    }

    public static void main(String[] args) {
        String a="11";
        String b="1";
        System.out.println(sol(a, b));
    }
}
