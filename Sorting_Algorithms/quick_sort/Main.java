import java.util.*;
class quickSort{
    static void swap(int[] arr, int i, int j){
        int temp;

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high){
        //using the last element as the pivot
        int pivot = arr[high];

        //var to indiciate the correct position of pivot
        //uptill this moment
        int i = low - 1;

        for(int j = low; j <= high - 1; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void sort(int[] arr, int low, int high){
        if(low < high){
            //finding out the partitioning index
            int pi = partition(arr, low, high);

            //now sorting across the partitioning index
            sort(arr, low, pi - 1);    //before pi
            sort(arr, pi + 1, high);   //after pi
        }
    }
}

public class Main{
    public static void main(String[] args){
        //given array
        int[] arr = { 10, 7, 8, 9, 1, 5 };

        //printing the original array
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        //length of array
        int n = arr.length;

        //creating an object for quicksort
        quickSort ob = new quickSort();
        ob.sort(arr, 0, n - 1);
        System.out.print(Arrays.toString(arr));

    }
}