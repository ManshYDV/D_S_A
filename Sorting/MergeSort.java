import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    private static void Merge(int [] arr, int si, int li){
        if(si>=li) return ;
        int mid=si + (li-si) / 2 ;
        Merge (arr, si , mid); //Left part
        Merge(arr, mid+1, li); // Right part
        Mg(arr ,si, mid, li);
    }
    private static void Mg(int [] arr , int si, int mid, int li){
        int [] temp=new int[li-si+1];
        int i=si; //iterator for the left side
        int j=mid+1; //iterator for the right part
        int k=0;  // iterator for temo array
        while(i<=mid && j<=li){
            if(arr[i]< arr[j]){
                temp[k]=arr[i];
            i++;
            }
             else {
                temp[k]=arr[j];
                j++;
             }
             k++;
        }
        while(i<=mid){ // for leftover elements on left side
            temp[k++]=arr[i++];
        }
        while(j<=li){ // for leftover elements on right side
            temp[k++]=arr[j++];
        }

        for(k=0, i=si; k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
       
     }
     private static void printMerge(int [] arr){
        System.out.println("After");
        System.out.println(Arrays.toString(arr));
     }
    public static void main(String[] args){
        int [] arr=new int[5];
        //int [] arr={6,3,9,1,0};
        Random rc=new Random(0);
        for(int i=0;i<arr.length;i++){
            arr[i]=rc.nextInt(30);
        }
        System.out.println("Before \n" + Arrays.toString(arr));
        Merge(arr,0,arr.length-1);
         printMerge(arr);
    }
}
