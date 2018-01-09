//Brandon Edwards
//ArrayProcessor.java
//11/20/17
//honor code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

//import statements to allow the use of a scanner for user
import java.util.Random;
import java.util.Scanner;

//a simple java that processes an array of random numbers
//into its sum, average,and min and max numbers
public class ArrayProcessor{
   public static void main(String [] args){
   
      //a random number generator to be used to fill the array
      //and a scanner for user input
      Random numberGenerator = new Random();
      Scanner keyboard = new Scanner(System.in);
      
      //an int for use in the init of the array to choose size 
      //and the creation of the array before initialization
      int sizeOfArray = 0;
      int[] arrayOfNums;
   
      //asking the user for the cap size of the array
      System.out.println("How many numbers would you like in the array?");
      sizeOfArray = keyboard.nextInt();
   
      //initializing the array with the user input 
      //and filling it with random numbers capped to 101 so that the sum of the numbers
      //probably won't be larger than the biggest possible int
      arrayOfNums = new int[sizeOfArray];
      for(int i = 0; i < arrayOfNums.length;i++){
         arrayOfNums[i] = numberGenerator.nextInt(101);
      }
      
      //invoking the two methods created to manipulate the array
      sumOfArray(arrayOfNums);
      arrayMinMax(arrayOfNums);
      
   }
   
   //a method to add all the numbers in the array and print them out
   public static void sumOfArray(int[] arrayOfNums){
      //a sentinel value to add up the sum
      int sumOfArray = 0;
      
      //printing out the length of the array for the users viewing pleasure
      System.out.println("The array is: " + arrayOfNums.length + " positions long.");
      
      //a loop to add each array entry to the sentinel value
      for(int i = 0; i < arrayOfNums.length; i++){
         sumOfArray += arrayOfNums[i];
      }
      //printing out the sum of all the array values
      System.out.println("the sum of all the entries is: " + sumOfArray);
   }
   
   //a method that adds up the average, highest value, and the lowest value of the array
   public static void arrayMinMax(int[] arrayOfNums){
      
      //sentinel values. min and max are initialized to the first array value
      //so that neither the min or max value is a value not in the array
      double averageOfArray = 0.0;
      int maxOfArray = arrayOfNums[0];
      int minOfArray = arrayOfNums[0];
      
      //loop that adds up the values of the array 
      //and compares them to the largest and smallest numbers seen so far
      for(int i = 0; i < arrayOfNums.length; i++){
         
         averageOfArray += arrayOfNums[i];
         
         if(arrayOfNums[i] > maxOfArray){
            maxOfArray = arrayOfNums[i];
         }
         if(arrayOfNums[i] < minOfArray){
            minOfArray = arrayOfNums[i];
         }
      }
      
      //dividing the summed average of values by the length of the array to get the average
      averageOfArray = (double)averageOfArray/arrayOfNums.length;
      
      //printing out the min, max, and average for the user
      System.out.println("The average of the array values is: " + averageOfArray);
      System.out.println("The highest number in the array is: " + maxOfArray);
      System.out.println("The lowest number in the array is: " + minOfArray);
   }
}