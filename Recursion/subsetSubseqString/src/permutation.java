import java.util.ArrayList;
import java.util.Arrays;

public class permutation {

    private static void sol(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first=p.substring(0,i);
            String second=p.substring(i, p.length());
            sol(first+ch+second, up.substring(1));
        }
    }

    private static ArrayList<String> sol1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            ans.addAll(sol1(first + ch + second , up.substring(1)));
        }
        return ans;
    }
    private static int rtrCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i, p.length());
          count=count+rtrCount(first+ch+second, up.substring(1));
        }
        return count;
    }

    public static void main(String[] args) {
      // sol("","abc");
       ArrayList<String> ans=sol1("","abcde");
        System.out.println(ans);
      //  System.out.println(rtrCount("","abc"));
    }
}
