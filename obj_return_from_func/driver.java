//trying to return multiple values from a function

class ret_obj{
    private String name = "Sam";
    private int age = 21;

    public String get_name(){
        return name;
    }

    public int get_age(){
        return age;
    }
}

class info{
    //assigning the default values from the ret_obj class.. can be changed to return other values by passing parameters
    public ret_obj get_info(){
        ret_obj o1 = new ret_obj();
        return o1;
    }

}

// writing the class to return the values of object 1 to object 2
public class driver{
    public static void main(String[] args){
        
        info o2 = new info();
        
        ret_obj o3 = new ret_obj();
        

        //o3 has to be created here since o2 is assigning a ret_obj type data
        //the ret_obj functions can be applied only to a reference variable of type ret_obj otherwise there will be a mismatch
        o3 = o2.get_info();

        System.out.println(o3.get_age() + " " + o3.get_name());


    }
}