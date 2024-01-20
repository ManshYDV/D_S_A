import java.util.ArrayList;

public class subSequence {

    private static void sol(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        sol(processed + ch, unProcessed.substring(1));
        sol(processed, unProcessed.substring(1));
    }

    private static ArrayList<String > sol2(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            ArrayList<String>  list=new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch=unProcessed.charAt(0);
        ArrayList<String> leftSide=sol2(processed + ch, unProcessed.substring(1));
        ArrayList<String> rightSide=sol2(processed, unProcessed.substring(1));
        leftSide.addAll(rightSide);
        return leftSide;
    }

    private static void sol3(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        sol3(processed + ch, unProcessed.substring(1));
        sol3(processed, unProcessed.substring(1));
        sol3(processed+(ch+0), unProcessed.substring(1));
    }

    public static void main(String[] args) {
        sol("", "abc");
        //sol3("","ab");
       // System.out.println(sol2("", "abc"));
    }
}
