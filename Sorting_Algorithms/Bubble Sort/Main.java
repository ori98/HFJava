//bubblesort algorithm
class bubbleSort{
    void sort(int[] arr, int n){
        //two corresponding elements are compared and then swapped
        int swapCount = 1;

        while(swapCount != 0){
            swapCount = 0;
            for(int i  = 0; i < n - 1; i++){
                if(arr[i] > arr[i + 1]){
                    arr[i] = arr[i] + arr[i + 1];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] = arr[i] - arr[i + 1];

                    swapCount++;
                }
            }
        }

        
    }
}


public class Main{

    static void printArray(int[] arr, int n){
        for(int i  = 0; i < n; i++){
            System.out.print(arr[i]);

            if(i == n - 1) break;

            System.out.print(", ");
        }

        System.out.println();
    }

    public static void main(String[] args){
        //driver program
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        //printing the initial array
        printArray(arr, arr.length);

        //creating an object for bubble sort
        bubbleSort ob = new bubbleSort();
        ob.sort(arr, arr.length);

        //printing the new array
        System.out.println("After sorting the array using Bubble Sort: ");
        printArray(arr, arr.length);
    }
}