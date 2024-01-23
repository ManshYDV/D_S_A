import java.util.ArrayList;
import java.util.List;

public class wordBreak {
    public static void main(String[] args) {
       String s="catsandog";
        // String s="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        List<String> wordDict=new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("dog");
        wordDict.add("a");
        wordDict.add("a");
        wordDict.add("a");
        System.out.println(wordBreak(s, wordDict));

    }
        public static boolean wordBreak(String s, List<String> wordDict) {
            if(s.isEmpty()){
                return true;
            }
            for(int i=1;i<=s.length();i++){
                String temp=s.substring(0,i);
                if(wordDict.contains(temp) && wordBreak(s.substring(i), wordDict)){
                    return true;
                }
            }
            return false;
        }

}
