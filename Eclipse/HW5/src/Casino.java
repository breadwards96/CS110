//Name: Brandon Edwards
//Date: 11/09/17
//Honor code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.
//File: Casino.java
//Description: a simple program that constructs 4 gamblers and lets the user 
//choose how much to bet and play the gamblers against eachother

//Psuedocode: import scanner, main method, init gamblers, setting winning %, print names and %s,
//while loop, scanner for bet, if and break, gamble each gambler, end

//imports to get user input
import java.util.Scanner;

public class Casino {

	public static void main(String[] args){
		
		//keyboard listener
		Scanner kb = new Scanner(System.in);
		
		//the gamblers with names constructed
		Gambler gambler1 = new Gambler("Grumpy");
		Gambler gambler2 = new Gambler("Sleepy");
		Gambler gambler3 = new Gambler("Sneezy");
		Gambler gambler4 = new Gambler("Cheaty");
		
		//setting winning %s for each gambler
		gambler1.setWinningPercentage(.34);
		gambler2.setWinningPercentage(.21);
		gambler3.setWinningPercentage(.59);
		gambler4.setWinningPercentage(.51);
		
		//printing out each gamblers name and win rate
		System.out.println("the gamblers are: ");
		System.out.println(gambler1.getGamblerName());
		System.out.println("Winning percentage: " 
		+ gambler1.getWinningPecentage());
		System.out.println(gambler2.getGamblerName());
		System.out.println("Winning percentage: " 
				+ gambler2.getWinningPecentage());
		System.out.println(gambler3.getGamblerName());
		System.out.println("Winning percentage: " 
				+ gambler3.getWinningPecentage());
		System.out.println("and");
		System.out.println(gambler4.getGamblerName());
		System.out.println("Winning percentage: " 
				+ gambler4.getWinningPecentage());
		
		//while loop to play the game
		while(true){
			System.out.println("\n" + gambler1.getGamblerName() 
			+ "\n has spent: $" + gambler1.getDollarsSpent()
			+ "\n possesses: $" + gambler1.getDollarsWon()
			+ "\n and has made: $" + gambler1.getNetProfit());
			
			System.out.println(gambler2.getGamblerName() 
			+ "\n has spent: $" + gambler2.getDollarsSpent()
			+ "\n possesses: $" + gambler2.getDollarsWon()
			+ "\n and has made: $" + gambler2.getNetProfit());
			
			System.out.println(gambler3.getGamblerName() 
			+ "\n has spent: $" + gambler3.getDollarsSpent()
			+ "\n possesses: $" + gambler3.getDollarsWon()
			+ "\n and has made: $" + gambler3.getNetProfit());
			
			System.out.println(gambler4.getGamblerName() 
			+ "\n has spent: $" + gambler4.getDollarsSpent()
			+ "\n possesses: $" + gambler4.getDollarsWon()
			+ "\n and has made: $" + gambler4.getNetProfit());
			
			//getting user input
			System.out.println("how much should each gambler bet?");
			double dollarsBet = kb.nextDouble();
			
			if(dollarsBet == 0){
				break;
			}
			
			//playing each round
			gambler1.gambleAnotherRound(dollarsBet);
			gambler2.gambleAnotherRound(dollarsBet);
			gambler3.gambleAnotherRound(dollarsBet);
			gambler4.gambleAnotherRound(dollarsBet);
		}
		//end of program
		System.out.println("Thanks for playing!");
	}
}
