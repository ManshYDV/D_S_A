public class skipString {

    private static String sol(String str){
        if(str.isEmpty()){
            return  "";
        }
        if (str.startsWith("apple")) {
            return sol(str.substring(5));
        }
        else{
            return str.charAt(0) + sol(str.substring(1));
        }
    }

    private static String sol1(String str){
        if(str.isEmpty()){
            return  "";
        }
        if (str.startsWith("app") && !str.startsWith("apple")) {
            return sol1(str.substring(3));
        }
        else{
            return str.charAt(0) + sol1(str.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(sol("manish like apple too much"));
        System.out.println(sol1("bcappledhappl"));
        String ans="manish";

    }
}
