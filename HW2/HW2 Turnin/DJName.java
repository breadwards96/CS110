//Author: Brandon Edwards
//Date: 10/2/17
//File: DJName.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

//A simple program to ask for first and last name
//and combine them with sizzle to make a DJ name
import java.util.Scanner;

public class DJName{

    //Main method
   public static void main(String[] args){
      
      //Declaration of a scanner variable to take keyboard input and
      //String variables to put the inputs in as well as
      //declaration of the sizzle string to put on the end of the finished name
      Scanner keyboard = new Scanner(System.in);
      String firstName, lastName, sizzle = "sizzle";
      
      //Print out asking for first name and scanner to catch the input and it into
      //the firstname variable
      System.out.println("enter your first name below and press return.");
      firstName = keyboard.nextLine();
      
      //Another print out to ask for last name this time and a scanner to catch
      //and contain that input in the lastname variable
      System.out.println("Now enter your last name below and press return.");
      lastName = keyboard.nextLine();
      
      //Initialization of variables to hold the modified substrings of firstname and lastname
      String firstHalf, lastHalf;
      
      //The modifying of the firstname and lastname variables and assigning those substrings to
      //the variables initialized in the last step
      firstHalf = firstName.substring(0, firstName.length() / 2);
      lastHalf = lastName.substring(lastName.length() / 2, lastName.length() - 1);
      
      //Finally the print of to the screen of the completed DJ name with all three parts
      //combined together
      System.out.println(firstHalf + lastHalf + sizzle);
   }
}