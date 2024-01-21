import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class letterCombinationOfPhone {
    public static void main(String[] args) {
        String s="23";
        Map<Character, String> digitToChar=new HashMap<>();
        digitToChar.put('2', "abc");
        digitToChar.put('3', "def");
        digitToChar.put('4', "ghi");
        digitToChar.put('5', "jkl");
        digitToChar.put('6', "mno");
        digitToChar.put('7', "pqrs");
        digitToChar.put('8', "tuv");
        digitToChar.put('9', "wxyz");
        List<String> ans=sol(s, digitToChar);
        System.out.println(ans);
    }

    private static List<String> sol(String s, Map<Character,String> digitToChar){
        List<String> ans=new ArrayList<>();
        if(s.isEmpty() || s == null) return ans;
        combination(s, 00, digitToChar,new StringBuilder(), ans);
        return ans;
    }

    private static void combination(String s, int index, Map<Character, String> digitToChar, StringBuilder sb, List<String> ans){
        if(index == s.length()){
            ans.add(sb.toString());
            return;
        }
        char digit=s.charAt(index);
        String letter=digitToChar.get(digit);
        for(char c : letter.toCharArray()){
            sb.append(c);
            combination(s, index+1, digitToChar, sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}


//public List<String> letterCombinations(String digits) {
//
//
//    String[] phone = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//    List<String> output = new ArrayList<>();
//    if (digits.isEmpty()) return output;
//    backtrack("", digits, phone, output);
//    return output;
//}
//
//private void backtrack(String combination, String next, String[] phone, List<String> output) {
//    if (next.isEmpty()) {
//        output.add(combination);
//        return;
//    } else {
//        String letters = phone[next.charAt(0) - '0'];
//        for (char letter : letters.toCharArray()) {
//            backtrack(combination + letter, next.substring(1), phone, output);
//        }
//    }
//}