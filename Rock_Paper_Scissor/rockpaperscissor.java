import java.util.Scanner;
public class rockpaperscissor{
    public static void main(String[] args){
        String[] possibilities = {"rock", "paper", "scissor"};
        
        int choices =  possibilities.length;          //total no of choices
        int choice = (int) (Math.random()*choices); //typecasting
        
        String comp_choice = possibilities[choice];
        
        //taking input from user
        // first creating scanner object scn
        
        Scanner s = new Scanner(System.in);
        
        //taking String input
        System.out.print("Please choose between rock, paper and scissor: ");
        String your_choice = s.next();
        //String your_choice = "paper";
        //storing win or loss in res (result)
        String res = "w";
        
        //assuming that true = user wins, false = computer wins
        
        //writing only those cases where the user will lose
        
        
        System.out.println("You chose: "+ your_choice);
        System.out.println("Computer chose: " + comp_choice);
        
        if(your_choice.equals("rock") && comp_choice.equals("paper")) res = "l";
        else if(your_choice.equals("paper") && comp_choice.equals("scissor")) res = "l";
        else if(your_choice.equals("scissor") && comp_choice.equals("rock")) res = "l";
        else if(your_choice.equals(comp_choice)) res = "t";
        
        
        System.out.println(res);
        if (res.equals("l")) System.out.println("Computer wins");
        else if(res == "t") System.out.println("It is a tie");
        else System.out.println("You win");
        
        
    }
}