import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int [] arr={1,8,9,4,3,77,77,5};
        //System.out.println(sol(arr, 0, 77));
        System.out.println(sol2(arr, 0, 77));
        //System.out.println(forDuplicates(arr,0,77,new ArrayList<>()));
    }

    private static ArrayList<Integer> sol2(int [] arr, int index, int target){
        ArrayList<Integer> list=new ArrayList<>();
        if(index == arr.length-1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromAbove= sol2(arr, index+1, target);
         list.addAll(ansFromAbove);
         return list;
    }

    private static int sol(int [] arr, int index, int target){
        if(index == arr.length-1){
            return -1;
        }
        return arr[index]==target ? index : sol(arr, index+1,target);
    }

     public static ArrayList<Integer> forDuplicates(int [] arr, int index, int target, ArrayList<Integer> list){
     if(index == arr.length-1){
         return list;
     }
     if(arr[index]==target){
           list.add(index);
     }
     return  forDuplicates(arr, index+1, target, list);
    }
}
