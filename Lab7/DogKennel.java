//Author: Brandon Edwards
//Date: 11/6/17
//File: DogKennel.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

//a simple program that instanciates three objects, assigns their fields values,
//and operates on their outputs
public class DogKennel{

   //the main method
   public static void main(String[] args){
      
      //instanciating three objects
      Dog dog1 = new Dog();
      Dog dog2 = new Dog();
      Dog dog3 = new Dog();
      
      //a welcome message
      System.out.println("Welcome to the dog kennel");
      
      //using methods to assign height, age, and name to the dog1 object
      dog1.setHeight(12.5);
      dog1.setAge(10);
      dog1.setName("Fido");
      
      //using methods to assign height, age, and name to the dog2 object
      dog2.setHeight(8.2);
      dog2.setAge(5);
      dog2.setName("Sparky");
      
      //using methods to assign height, age, and name to the dog3 object
      dog3.setHeight(15.1);
      dog3.setAge(8);
      dog3.setName("Frost");
      
      //summing the heights of the dogs and assigning a variable the result
      double sumHeights = dog1.getHeight() + dog2.getHeight() + dog3.getHeight();
      
      //summing the ages of the dogs and assigning a variable the result
      int sumAges = dog1.getAge() + dog2.getAge() + dog3.getAge();
      
      //combining all the names of the dogs into a variable to be used later
      String allDogNames = dog1.getName() + ", " + dog2.getName() + ", " + dog3.getName();
      
      //printing put the summed height and age of the dogs and listing the dogs names
      System.out.println("the sum of the dogs' heights is " + sumHeights);
      System.out.println("The sum of the dogs' ages is " + sumAges);
      System.out.println("all the dogs' names are " + allDogNames);
      
   }
}