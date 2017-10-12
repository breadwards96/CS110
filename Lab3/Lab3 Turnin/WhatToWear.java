//Author: Brandon Edwards
//Date: 10/5/17
//File: WhatToWear.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

//Simple java program that takes a predefined temperature and tells you what to wear
public class WhatToWear{

   //the main method
   public static void main(String[] args){
   
      //a variable to hold the temp
      double tempOutsideF = 68;
      double number = 12345.6789;
      double num = 0.039;
   
      //Two if statements to evaluate the temperature and tell you what to wear
      if(tempOutsideF < 30)
         System.out.println("wear boots, pants, sweater and gloves");
      
      if(tempOutsideF > 30)
         System.out.println("wear t-shirt, shorts, and sandals");
         
        //System.out.printf("%,.2f", number);
       
        System.out.printf("%10.03f", num);
      
   }
}