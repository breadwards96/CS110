//Author: Brandon Edwards
//Date: 10/5/17
//File: ClothingPickerIfElseIf.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

//a simple java program to ask the user for the temperature and uses an ifelseif statement
//to tell the user what to wear
import java.util.Scanner;

public class ClothingPickerIfElseIf{

   //main method
   public static void main(String[] args){
   
      //a variable to hold the temperature and a scanner to get input from the keyboard
      double tempOutsideF;
      Scanner keyboard = new Scanner(System.in);
      
      //a print statement that asks the user for the temperature and a scanner method
      //to put the input into a variable
      System.out.println("What is the temperature outside in fahrenheit?");
      tempOutsideF = keyboard.nextDouble();
   
      //an ifelseif statement to evaluate the users input and tell them what to wear
      if(tempOutsideF > 70){
         System.out.println("wear t-shirt, shorts, and sandals");
      
      }else if(tempOutsideF < 30){
         System.out.println("wear boots, pants, sweater and gloves");
      
      }else{
         System.out.println("wear long-sleeves, pants, and shoes");
      
      }   
   }
}