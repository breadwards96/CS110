//Author: Brandon Edwards
//Date: 10/5/17
//File: ClothingPickerWScanner.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

//a simple java program that asks the user for the temperature outside and
//tells them what to wear
import java.util.Scanner;

public class ClothingPickerWScanner{

   //main method
   public static void main(String[] args){
   
      //a variable to hold the outside temperature and a scanner object to get
      //keyboard input
      double tempOutsideF;
      Scanner keyboard = new Scanner(System.in);
      
      //a println statement that asks the user for the temperature and puts it in a variable
      System.out.println("What is the temperature outside in fahrenheit?");
      tempOutsideF = keyboard.nextDouble();
   
      //Two if statements to evaluate the temperature variable and tells the user what to wear
      if(tempOutsideF <= 30)
         System.out.println("wear boots, pants, sweater and gloves");
      
      if(tempOutsideF > 30)
         System.out.println("wear t-shirt, shorts, and sandals");
      
   }
}