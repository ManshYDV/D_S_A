public class lengthOFString {

    private static int sol(String str){
        if(str.equals("")){
            return 0;
        }
        else{
            return sol(str.substring(1))+1;
        }
    }
    public static void main(String[] args) {
        String str="Manish";
        System.out.println(sol(str));

    }
}
