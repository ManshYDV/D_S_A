import java.util.Stack;

public class StringReverse {
    public static void main(String[] args) {
        String name="Manish";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            stack.push(ch);
            name+=stack.pop();
        }
        String ans="";
        while (!stack.isEmpty()){
            ans+=stack.pop();
        }
        System.out.println(ans);
    }
}
