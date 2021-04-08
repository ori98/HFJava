import java.util.*;

//j is si and k is ei


public class Main {
    public static int gcd(int a, int b){
        if (b != 0){
            return gcd(b, b%a);
        }
    
        else
            return a;
    }

    public static int[] rotation(int[] arr, int n, int d){
        // to handle if d is >= n
        d = d % n;
        
        int i, j, k, temp;
        int g_c_d = gcd(n, d);

        for (i = 0; i < g_c_d; i++){
            temp = arr[i];
            //here j is the starting index
            j = i;
            while(true){
                //this is the value to be replaced with
                k = j + d;

                if(k >= n){
                    k = k - n;
                }

                if (k == i){
                    break;
                }

                arr[j] = arr[k];
                //replacing the value to replace back
                j = k;
            }
            arr[j] = temp;
            
        }

        return arr;
    }

    public static void printer(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++){
            System.out.println("Enter element at index: " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the shift value: ");
        int d = sc.nextInt();

        int[] rot = rotation(arr, n, d);
        printer(rot);

    }
}
