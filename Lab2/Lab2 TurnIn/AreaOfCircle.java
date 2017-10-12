// Name Brandon Edwards
// Date 10/3/17
// File AreaofCircle.java
// Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.
// Description 

import java.util.Scanner;

public class AreaOfCircle{ 
   public static void main(String[] args) { 

      // create a scanner object
      Scanner keyboard = new Scanner(System.in);

      // Step 1: declare a variable, call is radius, of type double
		double radius;
     
      // Ask the user to input a number with decimals
      System.out.print("Enter a decimal number, and press return  ");
      
      // place the user's input into the variable radius
      radius = keyboard.nextDouble();

      // Step 2: Declare a variable, call it diameter, of type double, 
      // and assign it the value of twice the variable radius. For this 
      // part, do NOT write "double diameter = 9.2". You must use the 
      // variable "radius". For example, if you were assigning the value 
      // to diameter to be one half of radius, you would write: 
      // 
      // double diameter = 0.5 * radius; 
		double diameter = radius * 2;

      // Step 3: Define a variable, circumference, of type double, and 
      // use the Math library's PI value to assign it a value that is 
      // the circumference, which has the formula pi * diameter. 
      // Hint: to use the Math Library's pi value, you use: Math.PI. 
      // See lecture 4: Primitives, operators, Math class for an example 
		double circumference = diameter * Math.PI;

      // Output the result to the screen 
      System.out.println("The circle with radius " + radius + 
            " has a circumference of " + circumference); 
   } 
}