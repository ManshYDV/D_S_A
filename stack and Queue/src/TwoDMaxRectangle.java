import java.util.Stack;

public class TwoDMaxRectangle {
    public static void main(String[] args) {
        int [][] arr={
                {1,0,1,0,0},
                {1,0,1,1,1},
                {1,1,1,1,1},
                {1,0,0,1,0}
        };
        System.out.println(sol(arr));
    }

    private static int sol(int [][] arr){
        int row=arr.length;
        int col=arr[0].length;
        int [] currentRect=new int[col];
        for(int i=0; i<col; i++){
            currentRect[i]=arr[0][i];
        }
        int max=moh(currentRect);
        for(int i=1;i<row;i++){
            for (int j=0;j<col;j++){
                if(arr[i][j] == 0){
                    currentRect[j]=0;
                }
                else{
                    currentRect[j]+=arr[i][j];
                }
            }
            max=Math.max(max, moh(currentRect));
        }
        return max;
    }

    private static int moh(int [] arr){
        int max=Integer.MIN_VALUE;
        int [] nsl=nsLeft(arr);
        int [] nsr=nsRight(arr);
        for(int i=0;i<arr.length;i++){
            int diff=(nsr[i] - nsl[i] - 1) * arr[i];
            if(diff > max){
                max=diff;
            }
        }
        return max;
    }


    private static int[] nsLeft(int [] arr){
        int [] ans=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }
            ans[i]=stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ans;
    }

    private static int [] nsRight(int [] arr){
        int [] ans=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }
            ans[i]=stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }
        return ans;
    }

}
