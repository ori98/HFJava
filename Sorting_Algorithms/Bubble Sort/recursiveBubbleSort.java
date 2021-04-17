import java.util.*;
public class recursiveBubbleSort {

    static void BubbleSort(int[] arr, int n){
        //base case
        if(n == 1) return;

        //basically removing the extra loop

        for(int i = 0; i < n -1; i++){
            if(arr[i] > arr[i + 1]){
                arr[i] += arr[i + 1];
                arr[i + 1] = arr[i] - arr[i + 1];
                arr[i] -= arr[i + 1];
            }
        }

        BubbleSort(arr, n - 1);
    }
    public static void main(String[] args){
        //driver program
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("After sorting the array: ");

        BubbleSort(arr, arr.length);

        System.out.println(Arrays.toString(arr));

    }
}
