import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationsSum {
    public static void main(String[] args) {
        int [] arr={2,3,6,7};
        List<List<Integer>> ans=sol(arr, 7);
        System.out.println(ans);
    }

    private static List<List<Integer>> sol(int [] arr, int target){
        List<List<Integer>> ans=new ArrayList<>();
        returnCombs(arr, 0, target, ans, new ArrayList<>());
        return ans;
    }

    private static void returnCombs(int [] arr, int index, int target, List<List<Integer>> ans, List<Integer> temp){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if( index == arr.length) {
            return;
        }
        if(arr[index] <= target){
            temp.add(arr[index]);
            returnCombs(arr, index, target - arr[index], ans, temp);
            temp.remove(temp.size()-1);
        }
        returnCombs(arr, index+1, target, ans, temp);

    }
}