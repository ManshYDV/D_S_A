public class AppearOnce {

    private  static int sol(int []arr){
        int ans=0;
        for(int i:arr) ans ^= i;
        return ans;
    }
    public static void main(String[] args) {
        int []arr={1,1,1,2,2,3,4,4,2,3,4,8};
       System.out.println( sol(arr));

    }
}
