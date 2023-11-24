package BinarSrch.BSonAnswers;

import java.util.ArrayList;
import java.util.List;

public class medianSortedArray {

    private static double iterative (int []arr1, int [] arr2 ){
       int n1=arr1.length;
       int n2=arr2.length;
        List<Integer> merge=new ArrayList<>();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(arr1[i] < arr2[j]){
                merge.add(arr1[i++]);
            }
            else{
                merge.add(arr2[j++]);
            }
        }
        while(i<n1){
            merge.add(arr1[i++]);
        }
        while (j<n2){
            merge.add(arr2[j++]);
        }
        int size=n1+n2;
        if(size%2==1){
            return (double) merge.get(size/2);
        }
        double evenAns= ((double) merge.get(size / 2) + (double) merge.get((size / 2) - 1)) / 2.0;
        return evenAns;
    }

    private static double notStoring(int [] a, int []b){
        int n1=a.length;
        int n2=b.length;
        int n=n1+n2;
        int ind2=n/2;
        int ind1=ind2-1;
        int count=0;
        int ind1El=-1,ind2El=-1;
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(a[i] < b[j]){
                if(count==ind1) ind1El=a[i];
                if(count==ind2) ind2El=a[i];
                count++;
                i++;
            }
            else{
                if(count==ind1) ind1El=b[j];
                if(count==ind2) ind2El=b[j];
                count++;
                j++;
            }
        }
        while (i<n1){
            if(count==ind1) ind1El=a[i];
            if(count==ind2) ind2El=a[i];
            count++;
            i++;
        }
        while(j<n2){
            if(count==ind1) ind1El=b[j];
            if(count==ind2) ind2El=b[j];
            count++;
            j++;
        }
        if(n%2==1){
            return (double) ind2El;
        }
        return (double)((double )(ind1El+ind2El))/2.0;
    }
    public static void main(String[] args) {
        int []arr1={2,4,6};
        int []arr2={1,3,5};
        System.out.println(iterative(arr1, arr2));
        System.out.println(notStoring(arr1,arr2));
    }
}
