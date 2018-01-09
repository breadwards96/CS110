//Author: Brandon Edwards
//Date: 10/31/17
//File: MyProgramWithOneMethod.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

// import statements
import java.util.Scanner;

public class MyProgramWithOneMethods {

   // the main routine
   public static void main(String[] args) {
   
      // print to the screen, instructions
      displayInstructions();
   
      // receive user's input
      Scanner keyboard = new Scanner(System.in);
      int myInteger = keyboard.nextInt();
      System.out.print("Please input your exponent; a positive integer less than 10 : ");
      int myExponent = keyboard.nextInt();
      int myIntegerPower = myInteger;
   
      // perform calculation
      for (int i = 2; i <= myExponent; i++) {
         myIntegerPower *= myInteger;
      }
   
      // output result
      System.out.println("The integer " + myInteger + " raised to the " + myExponent + "th power: " + myIntegerPower);
   }
   //a method that displays instructions to the user
   public static void displayInstructions(){
   
      System.out.println("This program calculates the nth power of a base integer input by the user. \n");
      System.out.print("Please input your base; an integer less than 10 : ");
   
   }
   
}