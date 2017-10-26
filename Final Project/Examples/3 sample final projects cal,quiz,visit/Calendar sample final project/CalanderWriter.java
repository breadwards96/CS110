Missing name, date, description

import java.io.FileNotFoundException;
import java.util.Random;
import java.io.PrintWriter;
import javax.swing.*;
public class CalanderWriter {
	
	//the amount of tasks that can be in each day
	public static final int TASKNUM = 20;
	//main method that does everything for now
	public static void main(String[] args) throws FileNotFoundException  {
		
		// print an introduction
		//some times display an alternate dialog box
		//using the random number class
		Random altIntro = new Random();
		int altIntroInt = altIntro.nextInt(2);
		System.out.println(altIntroInt);
		if (altIntroInt==1) {
			JOptionPane.showMessageDialog(null, "Hello how are you doing today?");
		}
		JOptionPane.showMessageDialog(null, "This program records tasks in a weekly "
				+ "calander");
		JOptionPane.showMessageDialog(null, "It is best to keep your tasks concise, as each task"
				+ " will have it's own line in the output file\nyou may only have 20 tasks per day");
		
		
		
		//call the method to create the array
		DayArray.createTasks();
		writeCalander();
	}
	
		public static void writeCalander() throws FileNotFoundException { 
			//initialize an output file name and create printwriter object
			String filename;
			filename = JOptionPane.showInputDialog("Please enter the name of the file you "
					+ "wish the calender to be written to");
			PrintWriter outputfile = new PrintWriter(filename);
			// Write to a file the day followed by all the tasks the user input for the day
			// Inform the user the file has been written.  
			
			//print the lines to the files
			printLines(outputfile);
			
			//close output file
			outputfile.close();
			
			//inform user that their tasks have been written to the file 
			JOptionPane.showMessageDialog(null, "Your tasks have been written to the file that "
					+ "you specified");
		}
			//this method prints the lines to the files.  
			public static void printLines(PrintWriter outputfile) {
				for (int i = 1;i <= 7;i++) {
					switch (i) {
						case 1:
							outputfile.println("Your tasks for Monday are:");
							for (int j = 0;j < TASKNUM;j++) {
								String element = DayArray.tasks[0][j];
								if (!(element==null)) {
									outputfile.println("	" + element);
								}
							}
							break;
						case 2:
							outputfile.println("Your tasks for Tuesday are:");
							for (int j = 0;j < TASKNUM;j++) {
								String element = DayArray.tasks[1][j];
								if (!(element==null)) {
									outputfile.println("	" + element);
								}
							}
							break;
						case 3:
							outputfile.println("Your tasks for Wednesday are:");
							for (int j = 0;j < TASKNUM;j++) {
								String element = DayArray.tasks[2][j];
								if (!(element==null)) {
									outputfile.println("	" + element);
								}
							}
							break;
						case 4:
							outputfile.println("Your tasks for Thursday are:");
							for (int j = 0;j < TASKNUM;j++) {
								String element = DayArray.tasks[3][j];
								if (!(element==null)) {
									outputfile.println("	" + element);
								}
							}
							break;
						case 5:
							outputfile.println("Your tasks for Friday are:");
							for (int j = 0;j < TASKNUM;j++) {
								String element = DayArray.tasks[4][j];
								if (!(element==null)) {
									outputfile.println("	" + element);
								}
							}
							break;
						case 6:
							outputfile.println("Your tasks for Saturday are:");
							for (int j = 0;j < TASKNUM;j++) {
								String element = DayArray.tasks[5][j];
								if (!(element==null)) {
									outputfile.println("	" + element);
								}
							}
							break;
						case 7:
							outputfile.println("Your tasks for Sunday are:");
							for (int j = 0;j < TASKNUM;j++) {
								String element = DayArray.tasks[6][j];
								if (!(element==null)) {
									outputfile.println("	" + element);
								}
							}
							break;
					}
				}	
			}
	

}
