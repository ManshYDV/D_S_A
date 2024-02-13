import java.util.Stack;

public class miniInsertionBalancePara {
    public static void main(String[] args) {
        String s="(()))";
        System.out.println(sol(s));
    }
    private static int sol(String s) {
    int value=0;
    Stack<Character> stack=new Stack<>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch == '('){
            stack.push(ch);
        }
        else if( i < s.length()-1 && ch == ')' && s.charAt(i+1) == ')' && !stack.isEmpty()){
            stack.pop();
        }
        else if(stack.isEmpty() && ch==')'){
            value++;
        }
    }
return value+stack.size();
    }
}
