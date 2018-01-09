//Author: Brandon Edwards
//Date: 11/6/17
//File: Dog.java
//Honor Code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

//a class to instanciating a dog object
public class Dog{

   //fields for the object to be assigned
   private double heightIn = 0.0;
   private int ageYears = 0;
   private String name = null;

   //a setter method to assign the dogs height
   public void setHeight(double height){
   
      heightIn = height;
   
   }
   
   //a setter method to assign the dogs age
   public void setAge(int age){
   
      ageYears = age;
   
   }
   
   //a setter method to assign the dogs name
   public void setName(String dogName){
   
      name = dogName;
   
   }

   //a getter method to return the dogs height
   public double getHeight(){
      return heightIn;
   }
   
   //a getter method to return the dogs age
   public int getAge(){
      return ageYears;
   }

   //a getter method to return the dogs name
   public String getName(){
      return name;
   }
}