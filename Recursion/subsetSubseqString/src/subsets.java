import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class subsets {
        public static List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);
            backtrack(result, new ArrayList<>(), 0, nums, new HashSet<Integer>() );
            return result;
        }
        private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int start, int[] nums, HashSet<Integer> used) {
            result.add(new ArrayList<>(tempList));

            for (int i = start; i < nums.length; i++) {

                if (i > start && nums[i] == nums[i - 1] && !used.contains(i - 1)) {
                    continue;
                }

                tempList.add(nums[i]);
                used.add(i);
                backtrack(result, tempList, i + 1, nums, used);
                tempList.remove(tempList.size() - 1);
                used.remove(i);
            }
        }

    public static void main(String[] args) {
        int [] arr={1,2,2};
        List<List<Integer>> result=subsetsWithDupl(arr);
        System.out.println(result);
    }
    public static List<List<Integer>> subsetsWithDupl(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), 0, nums);
        return list;
    }
    static void backtrack(List<List<Integer>> list, List<Integer> tempList, int start,int nums[]){
        if(start == nums.length){
            list.add(new ArrayList<>(tempList));
            return;
        }

        tempList.add(nums[start]);
        backtrack(list,tempList,start+1,nums);
        tempList.remove(tempList.size() - 1);
        while(start+1<nums.length && nums[start]  == nums[start+1] ){
            start++;
        }
        backtrack(list,tempList,start+1,nums);

        return;
    }
    }

