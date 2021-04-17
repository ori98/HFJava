//note that pairing occurs only at even places
import java.util.*;
class Main{

    public static int sockPair(int[] ar, int size){
        Arrays.sort(ar);

        int pair = 0;

        for (int i  = 1; i < size; i++){
            if (ar[i] == ar[i-1]){
                pair++;
                i++;
            }
        }

        return pair;
    }

//driver program for taking input and printing output
    public static void main(String[] args){
        //finding pair of socks
        Scanner sc = new Scanner(System.in);

        //input the number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];
        //input array
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The no. of pairs of socks are: " + sockPair(arr, n));
    }
}