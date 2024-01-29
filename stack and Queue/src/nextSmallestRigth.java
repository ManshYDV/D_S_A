import java.util.Arrays;
import java.util.Stack;

public class nextSmallestRigth {
    public static void main(String[] args) {
        int [] arr={4, 5, 2, 10, 8};
        System.out.println(Arrays.toString(sol(arr)));
    }

    private static int[] sol(int [] arr){
        int [] ans=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1; i>=0;i--){
            while(!stack.isEmpty() && arr[i] <= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }
            else if(!stack.isEmpty()){
                ans[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }
}
