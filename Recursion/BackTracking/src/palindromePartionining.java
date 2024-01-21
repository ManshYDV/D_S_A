import java.util.ArrayList;
import java.util.List;

public class palindromePartionining {
    public static void main(String[] args) {
        String s="abb";
        List<List<String>> ans=sol(s);
        System.out.println(ans);
    }

    private static List<List<String>> sol(String s){
        List<List<String>> ans=new ArrayList<>();
        backTrack(s, 0, new ArrayList<>(), ans);
        return ans;
    }

    private static void backTrack(String s, int start, List<String> current, List<List<String>> ans){
        if(start == s.length()){
            ans.add(new ArrayList<>(current));
            return;
        }

        for(int end=start + 1; end <= s.length(); end++){
            if(isPlaindrome(s, start, end - 1)){
                current.add(s.substring(start, end));
                backTrack(s, end, current, ans);
                current.remove(current.size()-1);
            }
        }
    }

    private static boolean isPlaindrome(String s, int start, int end){
        while( start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
