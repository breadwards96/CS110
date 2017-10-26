//Author: Brandon Edwards
//Date: 10/17/17
//File: OneThroughNine.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

//Pseudocode:
//1.Import the Scanner class 
//2.Create the java class OneThroughNine, and write the main routine.
//3.Declare a variable that will hold the integer that the user types, and create a Scanner object.
//4.Provide instructions to the user: “Pick a number, 1-9, that you want to know a fun fact about:”
//5.Use the nextInt() method of the Scanner class to retrieve the user's input
//6.Write a switch statement where the switch condition is the variable that holds the user's input
//7.Write the switch statement according to the above conditions (a-c)

//input restrictions: entering a String and entering a float
//can cause crash with nextInt()

import java.util.Scanner;

//a simple java program to take a users input in the form of an int
//and output a fun fact about that number
public class OneThroughNine{

   //the main method
   public static void main(String[] args){
   
      //declaring and int to hold the users input
      //and a scanner to get the input from System.in
      int numberChoice = 0;
      Scanner kb = new Scanner(System.in);
   
      //a print statement and a scanner assignment statement to ask for
      //and recieve user input
      System.out.println("Pick a number, 1-9, that you want to know a fun fact about");
      numberChoice = kb.nextInt();
   
      //a switch statement to evaluate the users input and output the correct response
      switch(numberChoice){
      
         case 1://user chose 1
            System.out.println("The number 1 is the smallest integer greater than zero");
            break;
      
         case 2://user chose 2
            System.out.println("2 is the only prime number that is even");
            break;
      
         case 3:
         case 9://user chose 3 or 9
            System.out.println("3 squared is 9, and the square root of 9 is 3");
            break;
      
         case 4://user chose 4
            System.out.println("4 is the smallest square greater than 1");
            break;
      
         case 5://user chose 5
            System.out.println("5 is one-half of ten. Wow");
            break;
      
         case 6://user chose 6
            System.out.println("6 is the smallest number that is equal to the sum of its proper divisors");
            break;
      
         case 7:
         case 8://user chose 7 or 8
            System.out.println("The numbers 7 and 8 are both less than 10. Amazing!");
            break;
      
      }
   }
}