//here we will see how the value of the instances (variables in the class can affect the methods in the class)
//this is known as change of state of the instance variables

class Dog{
    int size;
    String name = "something";

    //function called bark.. this function will have a loud or small bark depending on the size of the dog

    void bark(){
        if (size > 20){
            System.out.print(name + " says woof!!! woof");           //this is the loud bark
        }
        else{
            System.out.println(name + " says baw baw");              //this is the quiet bark
        }
    }
}

public class dogTestDrive{
    public static void main(String[] args){
        Dog[] d = new Dog[2];
        d[0] = new Dog();
        d[1] = new Dog();

        d[0].name = "Barney";
        d[0].size = 20;

        d[1].name = "Sam";
        d[1].size = 21;

        int i = 0;
        while(i < 2){
            d[i].bark();
            i++;
        }
    }
}