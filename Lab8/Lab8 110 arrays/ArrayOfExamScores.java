// Name : Brandon Edwards
// Date : 11/14/17
// honor code I pledge that this submission is solely my work,
// and that I have neither given to nor received help from anyone
// other than the instructor or TAs.
// Description: CS110, CWU; a simple program demonstrating the
// use of arrays
import java.util.Scanner;
import java.util.Random;

public class ArrayOfExamScores {

   // The main method
   public static void main(String[] args) {
   
      // Get from the keyboard, an integer, and save it into
      // the variable numStudentsInClass. You've done this many times
      // before. If you've forgotten how, then the code on page 85
      // of the textbook performs exactly this task (except the variable
      // should be named "numStudentsInClass" instead of "number"). Be
      // sure to ask the user, using a System.out.print statement,
      // how many students are in the class.
   
      Scanner kb = new Scanner(System.in);
      
      
      
      System.out.println("How many Students are in the class?");
      int numStudentsInClass = kb.nextInt();
      
      // Create a reference variable, named arrayOfTestScores, 
      // of type int[]. Create a new array that has as many integers
      // as the value that is saved in the variable numStudentsInClass.
      // You can do this using two statements. Either use two statements,
      // or use a single statement that achieves the same task. For 
      // example, if you wanted to create an array of 15 integers:
      // 
      // int numEntries = 15;
      // int[] arrayName;
      // arrayName = new int[numEntries];
      //
      // or
      //
      // int numEntries = 15;
      // int[] arrayName = new int[numEntries];
      
      int[] arrayOfTestScores = new int[numStudentsInClass];
   
      
      
      
      // Into each of the positions in the array named arrayOfTestScores,
      // place a randomly generated integer between 0 and 100. To do this, you
      // need to access each entry of the array, which has been initialized
      // to hold all zeros. You can complete this task by using a for loop. 
      // For example if you had an array called myArray, 
      // that had 5 entries that looked like the following, where the index 
      // below a box indicates the index number of the array (and is here the 
      // number of the student) :
      //
      //             ---------------------
      // myArray :   | 7 | 6 | 9 | 5 | 8 |
      //             ---------------------
      // index   :     0   1   2   3   4
      //
      // you could iterate over the array using the following for loop, and
      // place the number 12 into each position:
      //
      // for (int i = 0; i < 5; i++){
      //    myArray[i] = 12;
      // }
      // 
      // In this case, the number of entries that are saved in your array
      // is not a constant number, but instead is based on the input
      // supplied by the user. You can use either the length field of
      // the array (as was shown in class), or use the variable numStudentsInClass
      // as the bound condition of the for loop.
      //        
      // In order to place a random number between 0 and 100 into each
      // index of your array, use the Random class to create a random
      // number generator. Use the nextInt method from the
      // Random class at each iteration of the for loop, to place
      // a value between 0 and 100 into each index.
   
      Random testScore = new Random();
      
      for(int student = 0; student < arrayOfTestScores.length; student++){
         arrayOfTestScores[student] = testScore.nextInt(101);
         
      }
      
      
      // At this point, you have an array, with randomly generated numbers
      // ranging from 0 to 100. For this step, again iterate through the array (see
      // Step 3), and at each iteration of the for loop, print to the screen
      // the student number (the array index) and that student's randomly 
      // generated test score. To do this, issue the following 
      // System.out.println statement during each iteration of the for loop:
      // 
      // System.out.println("Student " + (i+1) + " has a score of " + arrayOfTestScores[i]);
      //
      // Because arrays indices begin at 0, you are using "(i+1)" to print to the screen
      // the array index, but incremented by 1, so that array index 0 corresponds to
      // person 1, array index 1 corresponds to person 2, array index 3 corresponds
      // to person 3, etc.
   
      
      for(int student = 0; student < arrayOfTestScores.length; student++){
         System.out.println("Student " + (student+1) + " scored: " + arrayOfTestScores[student]);
      }
      
      
      
      // Now, you want to calculate the average score of the randomly generated
      // exam scores that you have placed into your array. To do this, you'll need to create
      // a variable, of type integer, and name it runningTotal, and initialize it to 
      // the value 0. Use the variable runningTotal to keep the running 
      // sum total of the scores as you iterate through your array using the same for 
      // loop as in step 3. At each iteration of the for loop, increment the value
      // of runningTotal by the value of the integer at position i of the array
      // arrayOfTestScores.
   
      int runningTotal = 0;
      
      for(int student = 0; student < arrayOfTestScores.length; student++){
         runningTotal += arrayOfTestScores[student];
      }
      
      
      
      // Print to the screen, the average of the exam scores in your array. Remember
      // that the variables runningTotal and numStudentsInClass are integers, and if you
      // perform integer division, then you'll loose the decimal place. When you perform
      // the calculation for the average exam score, you'll need to cast runningTotal or 
      // numStudentsInClass to a double. Converting (or casting) from one primitive
      // data type to another was explained in class, and is discussed in section 2.7
      // of the textbook. Page 67 gives you sample code that you can use to make sure
      // that division that you perform with integers retains the decimal value. For
      // example, if you have two variables of type integer, var1 and var2, and you 
      // want to performed division and not lose the decimal point, you'd write:
      //
      // double result = (double)var1/var2;
      // 
      // After you calculate the average score, use a System.out.println statement
      // to print that value to the screen.		
      
      double average = (double)runningTotal/numStudentsInClass;
      
      System.out.println("the average test score is: " + average);
      
      // Print to the screen, the maximum exam score in your array, as well as
      // the person (index) who has the highest score. To do this, first define two variables
      // of type int. Name one of those variables maximumScore, and the other maximumScoreStudent.
      // Then, again iterate through the elements of your array using the for-loop
      // that has been given to you. In the body of the for loop, which will be executed
      // during each iteration of the for loop, check if the value at position i is
      // greater than the currently seen largest value stored in the variable maximumScore.
      // If yes, then update the variables maximumScore and maximumScoreStudent. The code
      // that you want to write into the body of your for loop is the following:
      // 
      // if (arrayOfTestScores[i] > maximumScore){
      //   maximumScore = arrayOfTestScores[i];
      //   maximumScoreStudent = i+1;
      // }
      // 
      // After you've determined the maximumScore and maximumScoreStudent,
      // use a System.out.println statement to print that value to the
      // screen.
      
      int maximumScore = 0, maximumScoreStudent = 0;
      
      for(int student = 0; student < arrayOfTestScores.length; student++){
         if(arrayOfTestScores[student] > maximumScore){
            maximumScore = arrayOfTestScores[student];
            maximumScoreStudent = student+1;
         }
      }
      System.out.println("Student " + maximumScoreStudent 
         + " scored: "+ maximumScore);
   }
}
