//Author: Brandon Edwards
//Date: 10/31/17
//File: MyProgramWithTwoMethods.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

// import statements
import java.util.Scanner;

public class MyProgramWithTwoMethods {

   // the main routine
   public static void main(String[] args) {
   
      // print to the screen, instructions
      displayInstructions();
   
      // receive user's input
      System.out.println("Please input your base; an integer less than 10 : ");
      int myInteger = getIntegerFromKeyboard(); 
      System.out.println("Please input your exponent; a positive" +
         " integer less than 10 : ");
      int myExponent = getIntegerFromKeyboard();
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
   
      System.out.println("This program calculates the nth power of a base integer input by the user.");
      System.out.print("Please input your base; an integer less than 10 : ");
   
   }
   //a method that takes a user input integer from the keyboard
   public static int getIntegerFromKeyboard(){
   
      Scanner keyboard = new Scanner(System.in);
      int keyboardInput = keyboard.nextInt(); 
      return keyboardInput;
   
   }
   
   public static int calcExponentValue(int integerValue, int exponentValue){
      int integerPower = integerValue;
      for (int i = 2; i <= exponentValue; i++){
         integerPower *= integerValue;
      }
      return integerPower;
   }
   
}