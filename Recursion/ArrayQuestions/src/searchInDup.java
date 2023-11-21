import java.util.ArrayList;

public class searchInDup {

    private  static ArrayList<Integer> sol(int []arr, int target, int index, ArrayList<Integer> list){

        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return sol(arr, target, index+1, list);

    }

    private  static  ArrayList<Integer> sol1(int []arr, int target, int index){
        ArrayList<Integer> list  =new ArrayList<>();
        if(index==arr.length-1){
            return list;
        }
        // this will contain the answer for that function call only.
        if(arr[index]==target){
            list.add(index);
        }
     ArrayList<Integer> ansFromBelow= sol1(arr, target, index+1);
     list.addAll(ansFromBelow);
     return list;
    }
    static ArrayList<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        int []arr={1,2,3,4,4,5,6};
        System.out.println(sol(arr, 4, 0, list));
        System.out.println(sol1(arr,4,0));

    }
}
