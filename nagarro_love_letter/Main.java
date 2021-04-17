public class Main{

    public static int gcd(int n1, int n2){
        if (n2 != 0){
            return gcd(n2, n2%n1);
        }

        else{
            return n1;
        }
    }

    public static String juggle(String oneWord, int shift){
        char[] word = oneWord.toCharArray();
        int n  = word.length;
        shift = shift%n;
        int i, si, ei;
        char temp;
        int g_c_d = gcd(shift, n);
        for (i = 0; i < g_c_d; i++){
            
            temp = word[i];
            si = i;
            while(true){
                ei = si + shift;

                if(ei >= n) ei -= n;

                if(ei == i) break;

                word[si] = word[ei];
                si = ei;
            }

            word[si] = temp;
        }

        String ans = new String(word);
        return ans;
    }

    //rotate words function 
    public static int rotateWords(String words, int k){
        String rotateWord[] = words.split("\\s");
        //count of rotated words
        int count = 0;
        //keeping a copy of the orginal set of words
        String cpy = words.intern();
        //splitting the words on every space;
        String[] actualWord = cpy.split("\\s");

        for (int i = 0; i < rotateWord.length; i++){
            rotateWord[i] = juggle(rotateWord[i], k);
            if (actualWord[i].equals(rotateWord[i]))
                count++;
        }

        return count;
        
    }

    public static void main(String[] args){
        //printing the results without taking input

        System.out.println("Count for the word adaaada " + rotateWords("adaaada", 3));
        System.out.println("Count for the wordloHel endFri " + rotateWords("loHel endFri", 3));
        System.out.println("Count for the word Hello dFrien " + rotateWords("Hello dFrien", 5));
    }
}