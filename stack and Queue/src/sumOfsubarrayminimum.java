import java.util.Stack;

public class sumOfsubarrayminimum {
    public static void main(String[] args) {
        int [] arr={3,1,2,4};
//        int m= 1000000007;
//        int result=0;
//        for(int i=0;i<arr.length;i++){
//            int minVal=arr[i];
//            for(int j=i; j<arr.length; j++){
//                minVal=Math.min(arr[j], minVal);
//                result+=minVal;
//            }
//        }
//        System.out.println(result);
        System.out.println(sol(arr));
    }

    private static int sol(int [] arr){
        int m=1000000007;
        int [] nsl=nextSL(arr);
        int [] nsr=nextSR(arr);
        long result=0;
        for(int i=0; i<arr.length; i++){
            long d1=i - nsl[i];
            long d2=nsr[i] - i;
            long total=d1*d2;
            long currSub=arr[i] * total;
            result=(result + currSub)%m;
        }
        return (int)result;
    }

    private static int[] nextSL(int [] arr){
        Stack<Integer> stack=new Stack<>();
        int [] ans=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }
            ans[i]=stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ans;
    }

    private static int[] nextSR(int [] arr){
        int [] ans=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }
            ans[i]=stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }
        return ans;
    }
}
