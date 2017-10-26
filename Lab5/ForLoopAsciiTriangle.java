//Author: Brandon Edwards
//Date: 10/22/17
//File: ForLoopAsciiTriangle.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

// Description: Creates a triangle of asterisks of the height the user selects from the keyboard

// Pseudocode: import scanner, declare one int(height), 
// input int triangle height.
// Nested for loops: outer is row,
// inner loop is number and placement of asterisk. 
 
// Input restrictions: letters or floats for height will crash it

import java.util.Scanner;

public class ForLoopAsciiTriangle{
   public static void main(String[] args){//main method
   
      //declaring an int variable to hold user input
      //and a scanner to get input form the keyboard
      int triangleHeight = 1;
      Scanner kb = new Scanner(System.in);
   
      //UI obtaining the height of the triangle
      System.out.println("How tall is the triangle");
      triangleHeight = kb.nextInt();
   
      //Nested for loops to print out the triangle
      for(int row = 0; row <= triangleHeight;row++){
         for(int column = 0;column < row;column++){
            System.out.print("*");
         }
         System.out.println();
      }
   
   
   }
}

