//Author: Brandon Edwards
//Date: 10/11/17
//File: NumDaysLeftInYear.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

/*Pseudocode
import scanner
declare class and main method
declare variables 
day(int) month(string) year(int) daysLeft(int)
initialize scanner
ask for day(int)
assign input
rinse repeat for month(string) and year(int)
make if statement to check for leap year
1 y%4 = 0 :2: else :5:
2 y%100 = 0 :3: else :4:
3 y%400 = 0 :4: else :5:
4 its leap
5 its not leap
make month lowercase
switch statement to find month number of days in year
31 28/29 31 30 31 30 31 31 30 31 30 31 = 365/366
daysLeft - days
print days left.
*/
/*Errors
An Input Mismatch error can occur when the input for days or year is not an int. Ex. 3.14
Another Input Mismatch error can occur when the input for days or years
is an number that is too large for the int data type. Ex. 99999999999999999999999999999999999999999999 
*/
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
      int dayOfMonth, year, daysLeftInYear = 0;
      String month;
      boolean leapYear = true;
      
      //performing 3 print statements with their accompanied scanner assignments
      //to get user input from the keyboard
      System.out.println("What's the name of the month?");
      month = keyboard.nextLine();
      
      System.out.println("What day of the month is it?");
      dayOfMonth = keyboard.nextInt();
      
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
            daysLeftInYear = 31;
            break;
         case "novemeber":
            daysLeftInYear = 61;
            break;
         case "october":
            daysLeftInYear = 92;
            break;
         case "september":
            daysLeftInYear = 122;
            break;
         case "august":
            daysLeftInYear = 153;
            break;
         case "july":
            daysLeftInYear = 184;
            break;
         case "june":
            daysLeftInYear = 214;
            break;
         case "may":
            daysLeftInYear = 245;
            break;
         case "april":
            daysLeftInYear = 275;
            break;
         case "march":
            daysLeftInYear = 306;
            break;
         case "february":
            if (leapYear)
               daysLeftInYear = 335;
            else
               daysLeftInYear = 334;
            break;
         case "january":
            if(leapYear)
               daysLeftInYear = 366;
            else
               daysLeftInYear = 365;
            break;
         default:
            System.out.println(month + " is not a month, try again");
      }
      
      //Math to subract the day of the month from the daysLeft variable
      //and print out the reassigned variable to the screen
      daysLeftInYear = daysLeftInYear - dayOfMonth;
      System.out.println("The number of days left in the year is " + daysLeftInYear);
   }
}