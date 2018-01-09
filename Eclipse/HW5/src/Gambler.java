//Name: Brandon Edwards
//Date: 11/09/17
//Honor code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.
//File: Gambler.java
//Psuedocode: import random, setup variables, make method headers, make constructor, 
//assign winningPercentage to winningPercentage, curse UML designer, 
//make if test and body for gambleAnotherRound, initialize constructor

//Description: a class for making and manipulating gamblers

//import for random in gambleAnotherRound
import java.util.Random;

public class Gambler {

	//Fields for the methods to work against
	private String gamblerName = null;
	private double winningPercentage = 0.0;
	private double dollarsSpent = 0.0;
	private double dollarsWon = 100.0;
	
	//the random for gambleAnotherRound
	Random winner = new Random();
	
	//a method to get a gamblers luck
	public double getWinningPecentage(){
		return winningPercentage;
	}
	
	//the method to set a gamblers luck
	public void setWinningPercentage(double winningPercentage){
		this.winningPercentage = winningPercentage;
	}
	
	//the method to play a round in the casino
	public void gambleAnotherRound(double dollarsBet){
		if(winner.nextDouble() < winningPercentage){
			dollarsSpent += dollarsBet;
			dollarsWon += dollarsBet * 1.5;
			System.out.println(gamblerName + "Won");
		}else{
			dollarsSpent += dollarsBet;
			dollarsWon -= dollarsBet;
			System.out.println(gamblerName + "Lost");
		}
		
	}
	
	//method that returns the gamblers name as a string
	public String getGamblerName(){
		return gamblerName;
	}
	
	//returns the money spent by the gambler
	public double getDollarsSpent(){
		return dollarsSpent;	
	}
	
	//returns the money the gambler currently has; is initialized to 100
	public double getDollarsWon(){
		return dollarsWon;
	}
	
	//returns the money the gambler has made
	public double getNetProfit(){
		return dollarsWon - dollarsSpent;
	}
	
	//constructs a gambler object and initializes a name to gambler
	public Gambler(String name){
		gamblerName = name;
	}
}
