//Author: Brandon Edwards
//Date: 10/31/17
//File: TerraceEverVerdant.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

import java.util.Scanner; // Import the Scanner class
import java.io.*;         // Import Java I/O classes

// Define a new class
public class TerraceEverVerdant { 

   // the main method
   public static void main (String[] args) throws IOException{ 
   
      // Important: make sure that you have retrieved the file
      // terraceEverVerdant.txt from the course website, and that 
      // you have saved that file into your lab5 folder.
   
      // 1. declare a variable, fileName, of type string, and assign 
      // it the value terraceEverVerdant.txt
      String fileName = "TerraceEverVerdant.txt";
   
      // 2. declare a variable, myFile, of type File, and
      // assign it to be a new instance of the File class,
      // and give the File class constructor the variable
      // fileName as the single argument 
      File myFile = new File(fileName);
   
      // 3. declare a variable, inputFile, of type Scanner,
      // and assign it to be a new instance of the Scanner
      // class, and give the Scanner class constructor 
      // the variable myFile as the single argument
      Scanner inputFile = new Scanner(myFile);
   
      // 4. declare a variable, loopNum, of type int, and 
      // assign it the value 0
      int loopNum = 0;
      // 5. use a while loop, whose conditional is the following:
      //
      // inputFile.hasNext()
      //
      // At each iteration of the while loop:
      //
      // a. increment loopNum by 1
      // b. declare variable fileLine as a String, and
      //    assign it the value inputFile.nextLine();
      // c. write an if statement, that checks if
      //    loopNum modulus 7 is equal to zero; if it is
      //    then use System.out.println to print to the
      //    screen the value stored in fileLine
      while(inputFile.hasNext()){
         loopNum++;
         String fileLine = inputFile.nextLine();
         if(loopNum %7 == 0){
            System.out.println(fileLine);
         }
      }
      inputFile.close();
   
   // 6. close the file
   
   }
}
	
