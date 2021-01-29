public class fizzbuzz_best {
    public static void main(String[] args){
        int c3 = 0;
        int c5 = 0;

        for (int i = 1; i < 101; i++){
            c3++;
            c5++;
            String d = "";

            if (c3 == 3) {
                d += "fizz";
                c3 = 0;
            }
            if (c5 == 5) {
                d += "buzz";
                c5 = 0;
            }

            if (d == "") System.out.println(i);
            else System.out.println(d);
        }
    }
}


//this is considered to be the best solution since the time-complexity increment due to the % operator has now been removed