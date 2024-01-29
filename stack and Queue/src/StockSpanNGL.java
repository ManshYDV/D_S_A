import java.util.Arrays;
import java.util.Stack;

public class StockSpanNGL {
    public static void main(String[] args) {
        int [] arr={100,80,60,70,60,85,100};
        System.out.println(Arrays.toString(sol(arr)));
    }

    private static int[] sol(int [] arr){
        int [] ans=new int[arr.length];
        int j=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0; i < arr.length;i++){
           while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
               stack.pop();
           }

            if(!stack.isEmpty()){
               ans[j++]=i - stack.peek();
           }
           else if(stack.isEmpty()){
//                ans[j++]=i;
                ans[j++]=1;
            }
           stack.push(i);
        }
        return ans;
    }
}
