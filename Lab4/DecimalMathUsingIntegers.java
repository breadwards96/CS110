//Author: Brandon Edwards
//Date: 10/17/17
//File: DecimalMathUsingIntegers.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

// Some pseudocode: import scanner, input 2 int, output them. Combine into double.  Using printf with commas and 6 decimals and f format

// Input restrictions: Inputting a float will crash nextInt()

//import scanner class
import java.util.Scanner;

//A simple program that uses only integers to make calculations from user input
//and outputs it as a double
public class DecimalMathUsingIntegers {

   //main method
   public static void main (String[] args) {
   
      //declaration of ints for user input, a double for output,
      //and a scanner to get input from system.in 
      int leftOfDecimalDigits = 0, rightOfDecimalDigits = 0;
      double composedDecimalVal = 0.0;
      Scanner kb = new Scanner(System.in);
      
      //ask the user for two inputs and assign it to the two int variables
      System.out.print("Input an integer for the digits to the left of the decimal: ");
      leftOfDecimalDigits = kb.nextInt();
      System.out.print("Input an integer >= 10, for the digits to the right of the decimal: ");
      rightOfDecimalDigits = kb.nextInt();
      
      //output status messages, and preform calculations
      System.out.println("The leftOfDecimalDigits variable has the value: " + leftOfDecimalDigits);
      System.out.println("The rightOfDecimalDigits variable has the value: " + rightOfDecimalDigits);
      composedDecimalVal = (double)leftOfDecimalDigits + (rightOfDecimalDigits/100.0);
      System.out.println("The composedDecimalVal is " + composedDecimalVal);
      
      //multiply composedDecimalVal by 10,000 and format the to contain commas
      //and six decimal places.
      System.out.printf("The formatted compsedDecimalVal times 10,000 is: %,.6f \n", + (composedDecimalVal * 10000.0));
   }
}