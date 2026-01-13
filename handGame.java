// Rock Paper Scissors Game 
import java.util.Random;  // to Generated the random number
import java.util.Scanner; // to get the user input
class handGame{              // creating the class
    public static void main(String[] args) {   // creating the main method
       
       try( Scanner input = new Scanner(System.in);){  // try and catch block and creating the scanner 
        Random rand = new Random();  // creating the random 
        Boolean play = true;    // boolean condition for play again
        String[] choices = {"rock","paper","scissors"}; // array contains of the strings
        while(play)   // while if play is true
        {
            System.out.println("Enter Your Choice : rock paper scissors");  // for users
            String player1 = input.nextLine().toLowerCase();  // get input and into lowercase
            String computer = choices[rand.nextInt(3)];  // get the string
            // to check the invalid input
            if(!player1.equals("rock") && !player1.equals("paper") && !player1.equals("scissors"))
            {
              System.out.println("Invalid Input");
             continue; // to continue while user input is wrong
            }
            System.out.println("Computer Choice is "+ computer); // showing the which is computer get by the random
            if(player1.equals(computer))  // Equals means tie
            {
                System.out.println("It's Tie");
            }
            // rules for game to win
            else if(player1.equals("rock")&& computer.equals("scissors") ||player1.equals("paper")&& computer.equals("rock") ||player1.equals("scissors")&& computer.equals("paper") )
            {
                System.out.println("You beat me");
            }
            // if the rules are not met 
            else{
                System.out.println("You Lose");
            }
            // asking the user to playagain or not
            System.out.println("Want to continue :yes/no");
            String playagain = input.nextLine().toLowerCase(); // get input from user 
            // check the input 
            if(playagain.equals("no"))
            {
                play = false;
            }
            
        }

    }

    }
}
