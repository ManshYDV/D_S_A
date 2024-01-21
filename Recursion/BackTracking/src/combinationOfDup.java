import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationOfDup {
    public static void main(String[] args) {
        int [] arr={10,1,2,7,6,1,5};
        List<List<Integer>> ans=sol(arr, 8);
        System.out.println(ans);
    }

    private static List<List<Integer>> sol(int [] arr, int target){
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        combOfDup(arr, 0, target, ans, new ArrayList<>() );
        return ans;
    }

    private static void combOfDup(int [] arr, int index, int target, List<List<Integer>> ans, List<Integer> temp){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        int i=index;
        while(i < arr.length){
            if(i > index && arr[i] == arr[i-1]){
                i++;
                continue;
            }
            if(arr[i] > target){
                break;
            }
            temp.add(arr[i]);
            combOfDup(arr, i+1, target-arr[i], ans, temp);
            temp.remove(temp.size()-1);
            i++;
        }
    }
}
