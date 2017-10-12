//Author: Brandon Edwards
//Date: 10/9/17
//File: NestedIfs.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

//a simple java program to ask the user for the temperature and uses an ifelseif statement
//to tell the user what to wear
import java.util.Scanner;

public class NestedIfs{

   //main method
   public static void main(String[] args){
   
      //variables to hold the temperature and rain status
      //and a scanner to get input from the keyboard
      double tempOutsideF;
      int rain = 0;
      Scanner keyboard = new Scanner(System.in);
      
      //a print statement that asks the user for the temperature 
      //and if its raining and a scanner method
      //to put the inputs into their respective variables
      System.out.println("What is the temperature outside in fahrenheit?");
      tempOutsideF = keyboard.nextDouble();
      System.out.println("Is it raining? (put 1 for yes and 0 for no)");
      rain = keyboard.nextInt();
      
      //3 nested if statements to evaluate the temperature and if its raining
      //and tell them what to wear
      if(tempOutsideF > 70){
         if(rain == 1){
            System.out.println("Wear t-shirt, jeans, converse and bring an umbrella");
         }else{
            System.out.println("Wear t-shirt, shorts, and sandals");
         }
      }else if(tempOutsideF < 30){
         if(rain == 1){
            System.out.println("Wear boots, pants, a rain jacket, and gloves");
         }else{
            System.out.println("Wear boots, pants, sweater and gloves");
         }
      }else{
         if(rain == 1){
            System.out.println("Wear shoes, pants, and a light jacket");
         }else{
            System.out.println("wear long-sleeves, pants, and shoes");
         }
      }
   }
}