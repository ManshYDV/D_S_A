public class Triangle1 {

    private static void sol(int row, int col){
        if(row==0){
            return;
        }
        if(row > col){
            System.out.print(" * ");
            sol(row, col+1);
        }
        else{
            System.out.println();
            sol(row-1,0);
        }
    }

    private static void sol2(int row, int col){
        if(row==0){
            return;
        }
        if(row > col){
            sol2(row, col+1);
            System.out.print(" * ");
        }
        else{
                       sol2(row-1, 0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        sol(5,0);
        sol2(5,0);
    }
}
