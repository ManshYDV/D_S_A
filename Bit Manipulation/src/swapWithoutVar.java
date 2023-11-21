public class swapWithoutVar {
    public static void main(String[] args) {


        int x = 100;
        int y = 50;
        //using add and sub method
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap using addition and subtraction " + x+" " + y);
        x=100;
        y=50;
        //swap using div and mul
        if(x==0){
            x=y;
            y=0;
        }
        else if(y==0){
            y=x;
            x=0;
        }
        else{
            x=x*y;
            y=x/y;
            x=x/y;
        }
        System.out.println("Swap after using div and mul "+x+" "+y);
        //swap using bitwise xor
        x=100;
        y=50;
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("Swap after bitwise XOR "+x+" "+y  );
    }
}
