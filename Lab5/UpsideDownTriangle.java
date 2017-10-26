//Author: Brandon Edwards
//Date: 10/24/17
//File: UpsideDownTriangle.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

// Description: Creates a Upside-down triangle of asterisks of the height the user selects from the keyboard

// Pseudocode: import scanner, declare one int(height), 
// input int triangle height.
// Nested decremeting for loops: outer is row,
// inner loop is number and placement of asterisk. 
 
// Input restrictions: letters or floats for height will crash it
import java.util.Scanner;

public class UpsideDownTriangle{
   public static void main(String[] args){
   
      //declaring a scanner and a variable to get and store user input
      int triangleHeight = 0;
      Scanner kb = new Scanner(System.in);
   
      //UI to obtain the height of the triangle
      System.out.println("How tall is the upside-down triangle");
      triangleHeight = kb.nextInt();
   
      //Two for loops to print the triangle
      //one decrementing to make the triangle upside down
      for(int row = triangleHeight;row>0;row--){
         for(int column = 0;column < row;column++){
            System.out.print("*");
         }
         System.out.println();
      }
   
   
   }
}