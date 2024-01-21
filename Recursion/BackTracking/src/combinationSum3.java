import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class combinationSum3 {
    public static void main(String[] args) {
        int k=3;
        List<List<Integer>> ans=sol(k, 7);
        System.out.println(ans);
    }

    private static List<List<Integer>> sol(int k, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        sum3(k, target, 1 , ans,new ArrayList<Integer>());
        return ans;
    }

    private static void sum3(int k, int target,int start, List<List<Integer>> ans, List<Integer> temp) {
        if(k == 0 && target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=9;i++){
            if(i > target){
                break;
            }
            temp.add(i);
            sum3(k-1, target-i,start+1,ans, temp);
            temp.remove(temp.size()-1);
        }
    }
}
