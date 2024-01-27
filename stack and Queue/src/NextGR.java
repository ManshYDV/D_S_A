import java.util.*;

public class NextGR {

    private static int[] sol(int [] arr1, int [] arr2){
    Stack<Integer> stack=new Stack<>();
        Map<Integer, Integer> map=new HashMap<>();
        int [] ans=new int[arr1.length];
        for(int i=arr2.length-1; i >= 0 ; i--){
            while(!stack.isEmpty() &&  arr2[i] > stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty()){
                map.put(arr2[i], stack.peek());
            }
            stack.push(arr2[i]);
        }
        for (int i=0;i<arr1.length;i++){
            arr1[i]=map.getOrDefault(arr1[i], -1);
        }
        return arr1;
    }

    public static void main(String[] args) {
        int [] arr1={4,1,2};
        int [] arr2={1,3,2,4};
        System.out.println(Arrays.toString(sol(arr1, arr2)));
    }
}
