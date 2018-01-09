//Author: Brandon Edwards
//Date: 10/31/17
//File: GenerateRandomLotteryNums.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

//import statements
import java.util.Scanner;
import java.util.Random;

//a simple program that generates lotto numbers for the user
public class GenerateRandomLotteryNums{

   //main method
   public static void main(String[] args){
   
      //declaring a scanner int and random object
      Scanner kb = new Scanner(System.in);
      int lengthOfLottoNumber = 0, highestPossibleLottoNumber = 0;
      Random randomNumber = new Random();
   
      //asking the user for the number of lotto numbers to generate and assigning it
      System.out.println("I know you are busy, so I will guess your \n loterry numbers" +
         " for you!" + "\n How many Numbers should I guess?");
      numberOfLottoNumber = kb.nextInt();
   
      //asking for the max number in the lotto number and assigning it
      System.out.println("What is the highest possible lottery number?");
      highestPossibleLottoNumber = kb.nextInt();
   
      //a for loop to generate and print the lotto numbers
      for(int i= 0; i <= numberOfLottoNumber; i++){
         
         int randomNum = randomNumber.nextInt(highestPossibleLottoNumber);
         
         //if statement to print the lotto numbers all pretty like
         if(i == 0){
            System.out.println("first lotto number: " + randomNum);
         }else if(i < NumberOfLottoNumber){
            System.out.println("The next lotto number: " + randomNum);
         }else{
            System.out.println("the last lotto number: " + randomNum);
         
         }
      
      }
   }
}