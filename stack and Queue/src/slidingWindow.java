import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class slidingWindow {
    public static int  sol(int [] num, int k){
        Deque<Integer> deck=new ArrayDeque<>();
        int sum=0;
        int j=0;
        int tempSum=0;
        for(int i=0;i<num.length;i++){
            if(j - i + 1 == k){
                sum-=num[i];
            }
            while(j - i + 1 != k){
                sum=sum+num[i];
                j++;
            }
            sum=Math.max(sum, tempSum);
        }
    return sum;
    }
    public static void main(String[] args) {
        int [] num={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println( sol(num, k));
    }
}
