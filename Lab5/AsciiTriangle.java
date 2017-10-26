//Author: Brandon Edwards
//Date: 10/17/17
//File: AsciiTriangle.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

// Description: Creates a triangle of what the user selects from the keyboard

// Pseudocode: import scanner, declare two ints(height and display), 
// input int triangle height, input display character.
// Nested while loops: outer is row,
// inner loop is number and placement of display character. 
 
// Input restrictions: letters or floats for height will crash it

import java.util.Scanner;
public class AsciiTriangle{
   public static void main(String[] args){

      int triangleHeight =0;
      String aSCIICharacter ="*";
      Scanner keyboard = new Scanner(System.in);

      // print instructions, input height of triangle
      System.out.println("This program prints a simple ASCII triangle.");
      System.out.print("How tall should the triangle be? ");
      triangleHeight =keyboard.nextInt()+1;
   
      //receive as input the ASCII character that should be used to print the ASCII
      System.out.print("What ASCII character should be used to draw the triangle? ");
      aSCIICharacter = keyboard.next();
   
      int triangleRow =1; // keep track of which row of the triangle you are printing
      String triangleRowChars = "";
      int rowCharacterPosition = 1;
   
      //at this point, triangleRow is 1
      while( triangleRow < triangleHeight  ){
         triangleRowChars = "";
         rowCharacterPosition  = 1;
         while ( rowCharacterPosition  <= triangleRow 
         
         ){
            triangleRowChars = triangleRowChars + 
               
               aSCIICharacter ;
            rowCharacterPosition  ++;
         } // While loop
      
         System.out.println(triangleRowChars );
         triangleRow ++;  // proceed to next row
      } // While loop
   
   } // main method
} // class AsciiTriangle