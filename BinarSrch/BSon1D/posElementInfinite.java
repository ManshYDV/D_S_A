package BinarSrch.BSon1D;

public class posElementInfinite {

    private  static  int sol(int []arr, int target, int start, int end){

       while(start <= end){
           int mid=start+(end-start)/2;
           if(target > arr[mid]){
               start=mid+1;
           }
           else if(target < mid){
               end=mid-1;
           }
           else{
               return mid;
           }
       }
return -1;
    }

    private  static  int range(int [] arr, int target){
        int start=0,end=1;
        while(target > arr[end]){
            int nstart=end +1;
            end=end +(end -start +1) *2;
            start=nstart;
        }
        return sol(arr, target, start, end);
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,7,8,9,10,11,12,13,14,18,19,20,24};
        int target=7;
       System.out.println( range(arr, target));
    }
}
