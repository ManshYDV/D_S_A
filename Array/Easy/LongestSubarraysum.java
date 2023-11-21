// public class LongestSubarraysum {

//     private static void sol(int [] arr ,int k){
//         int LongestSubarray=0;
//         int left=0;
//         int right=0;
//       while(right < arr.length){
//         int sum=0;
//         if(arr[left] + arr[right] == k){

//         }
//       }
//     }
//     public static void main(String[] args) {
//         int [] arr={2,3,5,1,9};
//         int k=10;
//         sol(arr, k);
//     }
// }
class P1 {
  static int findSum(int n) {
    int sum = 0;
    for (int x = 1; x <= n; x++)
      sum = sum + x;
    return sum;
  }

  public static void main(String args[]) {
    int n = 100;
    double d1 = System.nanoTime();
    int result = findSum(n);
    double d2 = System.nanoTime();
    System.out.println("Start" + d1);
    System.out.println("End" + d2);
    System.out.println(d2 - d1);
    System.out.println(result);
  }
}
