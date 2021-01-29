// here we will be printing the numbers from 1 - 100 and the aim is to convert every no divisible by 3 to fizz and no div by 5 to buzz and finally, every number divisible by 3 as well as 5 to fizzbuzz

//please remember that the order of 3 and 5 conditions matter in case of the if else condition

public class fizzbuzz_modulo{
    public static void main(String[] args){
        int i = 0;
        String d = "";
        for (i = 0; i < 101; i++){
            d = "";
            if (i % 3 == 0) d += "fizz";
            if (i % 5 == 0) d += "buzz";
            
            if (d == "") System.out.println(i);
            else System.out.println(d);
        }
    }
}