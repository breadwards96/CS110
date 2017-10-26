//Author: Brandon Edwards
//Date: 10/17/17
//File: TemperatureConverter.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

//pseudocode: scanner, make method public static void, declare variables,
//if statement,c=5/9(t-32)f=32+(t1.8), main, declare variables and scanner,
//print, assign, invoke

//input restrictions: A string in the first question will crash nextDouble()

import java.util.Scanner;

//a simple program that uses 2 methods to get and convert temperature
//between celcius and fahrenheit
public class TemperatureConverter{


   //a method that takes a double and a string then converts the temp between
   //fahrenheit and celcius
   public static void convertTemp(double temperature, String tempScale){
      
      //variable to hold converted temperature
      double convertTemp = 0;
      
      //an if statement that checks the tempscale and does the proper conversion
      //then outputs it
      if(tempScale.equals("f")){
         convertTemp = 5.0/9.0 * (temperature - 32);//the conversion for f to c
         System.out.println(temperature + " degrees in fahrenheit is equal to "
            + convertTemp + " in celsius.");
      }else if(tempScale.equals("c")){
         convertTemp = 32.0 + (temperature * 1.8);//the conversion for c to f
         System.out.println(temperature + " degrees in celsius is equal to "
            + convertTemp + " in fahrenheit.");
      }else{
         System.out.println("sorry that isnt an available temperature scale, "
            + "please try again");
      }
   }
   
   //main method
   public static void main(String[] args){
   
      //variables to hold user input and a scanner to read it
      double temperature;
      String tempScale;
      Scanner kb = new Scanner(System.in);
   
      //asking the user for the temperature and storing it in the double var
      System.out.println("What is the temperature?");
      temperature = kb.nextDouble();
   
      //asking the user f or c and storing it in a string
      System.out.println("is that in fahrenheit (enter f) or celsius (enter c)");
      tempScale = kb.next();
   
      //invoking the converttemp method with the assigned variables passed in
      convertTemp(temperature, tempScale);
      
   
   }
}