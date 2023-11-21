import java.util.Arrays;
import java.util.Scanner;

public class ShiftK {
    static Scanner sc = new Scanner(System.in);

    private static void leftRotate(int[] arr, int size, int k) {
        System.out.println("You have selected left rotation by " + k + " elements");
        int count = 0;
        if (size == 1 || size == 0) {
            System.out.println(Arrays.toString(arr));

        }
        int[] temp = new int[k];
        for (int j = 0; j < k; j++) {
            temp[j] = arr[j];
        }

        System.out.println(Arrays.toString(temp));
        for (int i = k; i <= size; i++) {
            arr[count++] = arr[i];
        }
        count = 0;
        for (int i = size + 1 - k; i < size + 1; i++) {
            arr[i] = temp[count++];
        }
        System.out.println("Array after left rotation");
        System.out.println(Arrays.toString(arr));
    }

    private static void rightRotate(int[] arr, int size, int k) {
        System.out.println("You have selected right rotation " + k + " Elements");
        int count = 0;
        if (size == 1 || size == 0) {
            System.out.println(Arrays.toString(arr));
        }
        int[] temp = new int[k];
        for (int j = size - k + 1; j < size + 1; j++) {
            temp[count++] = arr[j];
        }
        System.out.println(Arrays.toString(temp));
        count = 0;
        for (int i = size; i >= k; i--) {
            arr[i] = arr[size - k];
            size--;
        }
        count = 0;
        for (int i = 0; i < k; i++) {
            arr[i] = temp[count++];
        }
        System.out.println("Array after right rotation");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int size = arr.length;
        System.out.println("Enter value for k shift");
        int k = sc.nextInt();
        System.out.println("Enter 1 for right rotate and 2 for left rotate");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:

                rightRotate(arr, size - 1, k);
                break;
            case 2:
                leftRotate(arr, size - 1, k);
                break;
            default:
                System.out.println(("Plz select appropriate optins"));
        }
    }
}
// int n=nums.length; first approach
// if(n==0) return;
// k=k%n;
// if(k>n) return;
// int[] temp = new int[k];
// for (int i = n - k; i < n; i++) {
// temp[i - n + k] = nums[i];
// }
// for (int i = n - k - 1; i >= 0; i--) {
// nums[i + k] = nums[i];
// }
// for (int i = 0; i < k; i++) {
// nums[i] = temp[i];
// }

// for(int i=0;i<k;i++){ second approach
// int first=nums[0],j;
// for(j=0;j<nums.length-1;j++){
// nums[j]=nums[j+1];
// }
// nums[j]=first;
// }
