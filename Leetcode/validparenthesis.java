import java.util.Stack;

public class validparenthesis{

    public static boolean isopening(char c){
    return c=='(' || c=='{' || c=='[' ;
  }
 
public static boolean isMatching(char a, char b){
    return (a=='(' && b==')' )  || (a=='{' && b=='}' ) ||  (a=='[' && b==']' )  ;
   }
   
    public static boolean  parentheMatching(String s){
               if(s.length()%2!=0){
                return false;
               }
               Stack<Character> stack=new Stack<>();
               for(int i=0;i<s.length();i++){
               char c=s.charAt(i);
               if(isopening(c)){
                stack.push(c);
               }
               else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(!isMatching(stack.peek(), c)){
                return false;
               }
               else {
                stack.pop();
               }
               }
            }
               return stack.isEmpty();
        }
            
    public static void main(String[] args){
        String s="{([{}{])}";
        System.out.println(parentheMatching(s));
    }
}