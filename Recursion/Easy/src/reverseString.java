public class reverseString {

    private static char[] sol(char []str, int start, int end){
        if(start >= end){
            return str;
        }
        char ch= str[start];
        str[start]=str[end];
        str[end]=ch;
        return sol(str, start+1, end-1);

    }
    public static void main(String[] args) {
        char [] s={'h','e','l','l','o'};
        System.out.println(sol(s, 0, s.length-1));
    }
}
