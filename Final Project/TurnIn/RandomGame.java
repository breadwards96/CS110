//Brandon Edwards
//RandomGame.java
//10/30/17
//honor code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

//importing a scanner for user input
//and random for random number generation
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

//a simple game that asks the user to guess a number between one
//and ten then the computer generates a number within the same range
//and awards a point to the user if the numbers are the same
public class RandomGame {

   public static void main(String[] args) throws IOException {
   
      //a scanner named kb for keyboard used for getting user input
      Scanner kb = new Scanner(System.in);
      //a string to store the users name when they are asked for it
      String name = null;
      //a savefile object used to print the users name to a file
      SaveFile save = new SaveFile();
      //a gamemath object thats used to run the majority of the games code
      GameMath run = new GameMath();
   
      //asking the user for their name and printing it to a file
      System.out.println("What is your name?");
      name = kb.nextLine();
      save.simpleSetName(name);
      
      //prints out a greeting to the user
      //uses a method to satisfy one of the three method requirements
      System.out.println(greeting(name));
      
      //this runs the method with most of the game code in it
      //see the GameMath class for more details
      run.runGame();
      
      //a goodbye to the user
      System.out.println("thanks for playing, see ya next time!");
      
      //this method closes all readers and writers used by the savefile object
      save.close();
   }
   
   //a method that takes the name of the user and combines it with a greeting
   //to be returned as a string
   public static String greeting(String name){
   
      String greeting = "Hello " + name + ", let's play a game.";
   
      return greeting;
   }
}
