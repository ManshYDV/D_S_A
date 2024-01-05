package Strings.Easy;

public class checkIfTwoArray {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            sb1.append(word1[i]);
        }
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<word2.length;i++){
            sb2.append(word2[i]);
        }
        System.out.println(sb1 + ""+sb2);
        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        String [] word1={"ab", "c"};
        String [] word2={"a", "bc"};
       System.out.println(arrayStringsAreEqual(word1, word2));

        String s="man";
        s.indexOf("an");
    }
}
