

public class OddorEven {

    private static boolean sol(int number){
        return (number & 1) == 1;
    }
    public static void main(String[] args) {
        int number=20;
        System.out.println(sol(number));
    }
}
