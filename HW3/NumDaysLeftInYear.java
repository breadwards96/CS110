//Author: Brandon Edwards
//Date: 10/11/17
//File: NumDaysLeftInYear.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

import java.util.Scanner;

//A simple java program to take the day month and year
//and output the number of days left in the year
public class NumDaysLeftInYear{

   //main method
   public static void main(String[] args){
      
      //Initializing a scanner to get keyboard input,
      //declaring 3 ints for dates, a string for the month,
      //and a boolean for the leap year value
      Scanner keyboard = new Scanner(System.in);
      int day, year, daysLeft = 0;
      String month;
      boolean leapYear = false;
      
      //performing 3 print statements with their accompanied scanner assignments
      //to get user input from the keyboard
      System.out.println("What's the name of the month?");
      month = keyboard.nextLine();
      
      System.out.println("What day of the month is it?");
      day = keyboard.nextInt();
      
      System.out.println("Finally what is the year?");
      year = keyboard.nextInt();
      
      
      //an if statement to perform math on the year variable
      //in order to determine if it is a leap year
      if (year%4 == 0){
         if (year%100 == 0)
            if (year%400 == 0)
               leapYear = true;
      }else{
         leapYear = false; }   
         
         
      //a switch statement to take the month string
      //and assign the right number of days left in the year
      //to the daysLeft variable
      switch (month.toLowerCase()){
         case "december":
            daysLeft = 31;
            break;
         case "novemeber":
            daysLeft = 61;
            break;
         case "october":
            daysLeft = 92;
            break;
         case "september":
            daysLeft = 122;
            break;
         case "august":
            daysLeft = 153;
            break;
         case "july":
            daysLeft = 184;
            break;
         case "june":
            daysLeft = 214;
            break;
         case "may":
            daysLeft = 245;
            break;
         case "april":
            daysLeft = 275;
            break;
         case "march":
            daysLeft = 306;
            break;
         case "february":
            if (leapYear)
               daysLeft = 335;
            else
               daysLeft = 334;
            break;
         case "january":
            if(leapYear)
               daysLeft = 366;
            else
               daysLeft = 365;
            break;
            default:
            System.out.println("Thats not a month, try again");
      }
      
      //Math to subract the day of the month from the daysLeft variable
      //and print out the reassigned variable to the screen
      daysLeft = daysLeft - day;
      System.out.println("The number of days left in the year is " + daysLeft);
   }
}