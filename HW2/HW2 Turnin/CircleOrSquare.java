//Author: Brandon Edwards
//Date: 10/4/17
//File: CircleOrSquare.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

//A simple program to caculate the circumference of a circle and the perimeter of a square
import java.util.Scanner;

public class CircleOrSquare{

   //The main method
   public static void main(String[] args){
      
      //Initialization of three variables to hold the shape measurements when
      //they are input by the user and a scanner object to catch the input in the next lines
      double radius, length, width;
      Scanner keyboard = new Scanner(System.in);
      
      //The prompts and scanner statements to obtain the shape measurements
      //and store them in their respective variables
      System.out.println("Enter the radius of the circle");
      radius = keyboard.nextDouble();
      
      System.out.println("Enter the length of the square");
      length = keyboard.nextDouble();
      
      System.out.println("Enter the width of the square");
      width = keyboard.nextDouble();
      
      //The initialization and assignment of variables that will hold the circumference and perimeter
      //that will be output by the print statements in the next lines
      double circum = Math.PI * 2 * radius,
         perim = 2 * (length + width);
      
      //The print statements that will tell the user the circumference and perimeter
      //of the shapes they entered
      System.out.println("The circumference of the circle is: " + circum);
      
      System.out.println("The perimeter of the square is: " + perim);
   }
}