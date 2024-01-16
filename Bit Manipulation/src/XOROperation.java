public class XOROperation {

        public static int xorOperation(int n, int start) {
            int answer=0;
            int i=0;
            while(i < n){
                int temp=getXor(start, i);
                answer^=temp;
                temp=0;
                i++;
            }
            return answer;
        }
        public static int getXor(int start, int i){
            int ans=start + 2 * i;
            return ans;
        }

    public static void main(String[] args) {
        int start=0;
        int n=5;
        System.out.println(xorOperation(n, start));
    }

}
