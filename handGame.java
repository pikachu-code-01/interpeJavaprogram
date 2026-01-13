// Rock Paper Scissors Game 
import java.util.Random;
import java.util.Scanner;
class handGame{
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Boolean play = true;
        String[] choices = {"rock","paper","scissors"}; 
        while(play)
        {
            System.out.println("Enter Your Choice : rock paper scissors");
            String player1 = input.nextLine().toLowerCase();
            String computer = choices[rand.nextInt(3)];
            if(!player1.equals("rock") && !player1.equals("paper") && !player1.equals("scissors"))
            {
              System.out.println("Invalid Input");
             continue;
            }
            System.out.println("Computer Choice is "+ computer);
            if(player1.equals(computer))
            {
                System.out.println("It's Tie");
            }
            else if(player1.equals("rock")&& computer.equals("scissors") ||player1.equals("paper")&& computer.equals("rock") ||player1.equals("scissors")&& computer.equals("paper") )
            {
                System.out.println("You beat me");
            }
            else{
                System.out.println("You Lose");
            }
            System.out.println("Want to continue :yes/no");
            String playagain = input.nextLine().toLowerCase();
            if(playagain.equals("no"))
            {
                play = false;
            }
            
        }

    }
}
