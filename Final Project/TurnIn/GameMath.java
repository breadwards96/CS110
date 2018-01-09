//Brandon Edwards
//GameMath.java
//11/28/17
//honor code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.
import java.util.Scanner;
import java.util.Random;

public class GameMath{

   final int MAX_SCORE = 5;
   int guess = 0, score = 0;
   String start = null;
   Scanner kb = new Scanner(System.in);

   public void runGame(){
   
      //game loop that goes until the player scores 5 points
      while (score < MAX_SCORE) {
         
         //asks the player if they want to keep going
         // or break out of the loop
         System.out.println("Press enter to continue or press q to exit");
         start = kb.nextLine();
         
         if (start.equals("q")) {
            break;
         }
         
         //this will auto win you the game
         //it is for error testing and cheaters
         if (start.equals("auto")){
         score = 5;}
         
         //dialog to interface with the user
         //the print with a bunch of new lines is for readablilty
         //and aesthetic
         System.out.print("\n\n\n\n\n\n\n\n\n");
         System.out.println("your score is " + score);
         
         System.out.print("\n");
         
         System.out.print("guess a number between one and ten: ");
         guess = kb.nextInt();
         
         System.out.print("\n");
         
         String flush = kb.nextLine();
         flush = null;//still having trouble with nonempty buffer bug
         //this fixes it
         
         //generating a random number between 1 and 10
         Random randomNumberGen = new Random();
         int randomNumberInt = randomNumberGen.nextInt(10)+1;
         String congrats = "";
            
         //this switch assigns a congratulation message based
         //on the number generated
         switch(randomNumberInt){
            
            case 1:
               congrats = "Good Job";
               break;
            case 2:
               congrats = "Wow";
               break;
            case 3:
               congrats = "Amazing";
               break;
            case 4:
               congrats = "Congratulations";
               break;
            case 5:
               congrats = "Hey";
               break;
            case 6:
               congrats = "Woah";
               break;
            case 7:
               congrats = "Yippee";
               break;
            case 8:
               congrats = "Hooray";
               break;
            case 9:
               congrats = "Spectacular";
               break;
            default://this counts as 10 and error handling
               congrats = "Cool";
         }
            
         System.out.println("the number I was thinking of was "
                    + randomNumberInt + "\n");
         
         //this congratulates the player
         //and gives them a point if they guess right
         if (randomNumberInt == guess) {
            System.out.println(congrats + ", you scored a point! \n");
            score++;
         }
      
      }
      //this is congratulates the player right before the loop ends
      if (score >= MAX_SCORE) {
         System.out.println("wow you scored " + MAX_SCORE
                    + " points, you win!");
      }
   }
}