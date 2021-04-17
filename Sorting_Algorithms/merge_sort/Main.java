class MergeSort{
    //this will consist of 2 functions: 1 is merge other is sort
    void merge(int[] arr, int l, int r, int m){
        //finding the size of the two arrays
        int n1 = m - l + 1; //left array
        int n2 = r - m;     //right array

        //creating two temp arrays to store the values
        int[] L = new int[n1];
        int[] R = new int[n2];

        //storing the values in the temp array
        int i = 0, j = 0;
        for(i = 0; i < n1; i++){
            L[i] = arr[l + i];          //goes upto middle elm
        }

        for(j = 0; j < n2; j++){
            R[j] = arr[(m + 1) + j];    //starts from the middle elm
        }


        //merge in the orginal array in ascending order
        int k = l; //initial index of original array k, i (L array) and j (for R array)
        i = 0; j = 0; //making i and j 0 again

        while(i < n1 && j < n2){
            if(L[i] < R[j]){
                arr[k] = L[i];
                i++;
            }

            else{
                arr[k] = R[j];
                j++;
            }

            k++;
        }


        //for remaining elements
        while(i < n1){
            arr[k] = L[i];
            k++;
            i++;
        }

        while(j < n2){
            arr[k] = R[j];
            k++;
            j++;
        }

    }

    void sort(int[] arr, int l, int r){
        
        if(l < r){
        //creating a recursive function
        //finding the mid value
        int m = l + (r - l)/2;

        sort(arr, l, m);
        sort(arr, m + 1, r);

        //merge the sorted arrays
        merge(arr, l, r, m);
        }

    }
}


//driver program
public class Main{
    //program to print the arrays
    static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args){

        int[] arr = { 12, 11, 13, 5, 6, 7 };
        //printing out the array we chose
        System.out.println("Given array: ");
        printArray(arr);

        //creating an object for merge sort
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        //now printing the array
        printArray(arr);
    }
}