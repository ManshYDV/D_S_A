public class longestSubString {

    public static int lsb(String s){
        int max1=0;
         for(int right=0, left=0; right<s.length();right++){
          int currentIndex=s.indexOf(s.charAt(right), left);
          if(currentIndex != right){
              left=currentIndex+1;
          }
            max1=Math.max(max1, right-left +1);
        }
    
      return max1;
    }



         public static void main(String[] args){
        String s="maanish";
        System.out.println(lsb(s));
    }
}
 
//         ArrayList<Integer> arr=new ArrayList<>(0);
//       Stack<Character> stak=new Stack<>();
// for(int i=0;i<s.length()-1;i++){
//     char c=s.charAt(i);
    
//     if(Character.toString(c).equals(Character.toString(s.charAt(i+1)))){
//      arr.add(j,1+stak.size());
//      j++;
//      stak.clear();
//     }
//     else{
//         stak.push(c);
//     }
//    }
//  System.out.println(arr.size());
//     System.out.println(arr);
//     return Collections.max(arr);
// }
   
//       int max=0;

//       Stack<Character> stak=new Stack<>();
// for(int i=0;i<s.length()-1;i++){
//     if(stak.contains(s.charAt(i))){
//         while(!stak.isEmpty() && stak.peek()!=s.charAt(i)){
//             stak.pop();
//         }
//         stak.pop();
//     }
//     stak.push(s.charAt(i));
//    // max=Math.max(max, stak.size());
//    if(max>=stak.size()){
//     max=max-1;
//    }
//    else max=stak.size();
// }
// return max;

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//     int max=0;
//    for(int right=0 ,left=0; right<s.length();right++){
//        int currentIndex=s.indexOf(s.charAt(right), left);
//        if(currentIndex!=right){
//            left=currentIndex+1;
//        }
//        max=Math.max(max,right-left+1);
//    }
//    return max;
// }
// }