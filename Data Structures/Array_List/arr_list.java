//for a variable sized array, we use an arraylist

import java.util.ArrayList;

public class arr_list{
    public static void main(String[] args){
        //creating an array list
        ArrayList<Integer> arr_list = new ArrayList<>();
        

        //printing size of the array list

        System.out.println(arr_list.size());



        //adding an element in the array list

        arr_list.add(12);
        arr_list.add(1);
        arr_list.add(50);

        System.out.println("Printing the array list: " + arr_list);

        System.out.println("Now updating the list by adding 4 at 2nd index");
        arr_list.add(2, 4);

        System.out.println("New array list: " + arr_list);

        System.out.println("Getting only one element from the array list at a specific index");

        System.out.println(arr_list.get(2));

        System.out.println("Now printing all elements using loop");

        for (int i = 0; i < arr_list.size(); i++){
            System.out.print(arr_list.get(i) + " ");
        }

        System.out.println("Now removing the element at the 0th index");

        arr_list.remove(0);

        System.out.println(arr_list);


        System.out.println("Now in order to replace/overwrite a value in the array list we use the set method");

        System.out.println("Setting the value at index 2 to be 999");

        arr_list.set(2, 999);

        System.out.println("The replaced array value now looks like" + arr_list);
    }
}