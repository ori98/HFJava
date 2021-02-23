import java.util.ArrayList;
import java.util.Scanner;
public class for_each_loop {
    public static void main(String[] args){
        ArrayList<Integer> arr_list = new ArrayList<>();
        
        Scanner scn = new Scanner(System.in);

        //inputing using loop


        for (int i  = 0; i <= 9999; i++){
            int a = scn.nextInt();

            arr_list.add(i, a);
        }


        System.out.println(arr_list);
        
    }
}
