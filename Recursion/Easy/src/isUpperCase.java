public class isUpperCase {

    private static char sol(String str, int index){
        if(Character.isUpperCase(str.charAt(index))){
            return str.charAt(index);
        }
        return sol(str,index+1);
    }
    public static void main(String[] args) {
        String str="manisYadav";
        System.out.println(sol(str, 0));
    }
}
