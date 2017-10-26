Missing name, date, description

import javax.swing.JOptionPane;

public class DayArray {
	// create an empty array with one dimension for each day
	public static String[][] tasks = new String[7][CalanderWriter.TASKNUM];
	
	//method to create the array of tasks given user input
	public static void createTasks() {
		//create a string day that will indicate which day to record tasks for
		String day = "";
				
		//initialize a string for the get task section
		String task = "";
				
		//declare a string for the while loop in the for loop to write tasks as long as the 
		//user wants
		String keepWriting = "";
				
		//initialize int count to save task to right place in array
		int count;
		
		//introduction message
		JOptionPane.showMessageDialog(null, "Please note that once you select a day to write"
				+ " tasks for if you select it again it will corrupt the data you have written "
				+ "for that day already");
		//prompt user for tasks and save them in an array
		while (!(day.equals("q") || day.equals("Q"))) {
			day = JOptionPane.showInputDialog("What day would you like to record tasks for?\n"
					+ "please type the first three letters of the day you wish to select\n"
					+ "(or press Q to quit)");
			day = day.toUpperCase();
			keepWriting = "";
			count = 1;
			if (day.equals("MON")) 			{
				task = getTask();
					tasks[0][0] = task;
				while (!(keepWriting.equals("y") || keepWriting.equals("Y"))&&count<10) {
					keepWriting = JOptionPane.showInputDialog("Would you like to quit writing "
							+ "tasks for this day? (Press Y for yes or enter to keep going)");
					if (!(keepWriting.equals("y") || keepWriting.equals("Y"))) {
						task = JOptionPane.showInputDialog("Please enter a task you need to do "
							+ "for this day");
						tasks[0][count] = task;
						count++;
					}
				}
			} else if (day.equals("TUE"))  	{
				task = getTask();
					tasks[1][0] = task;
				while (!(keepWriting.equals("y") || keepWriting.equals("Y"))) {
					keepWriting = JOptionPane.showInputDialog("Would you like to quit writing "
							+ "tasks for this day? (Press Y for yes or enter to keep going)");
					if (!(keepWriting.equals("y") || keepWriting.equals("Y"))) {
						task = JOptionPane.showInputDialog("Please enter a task you need to do "
							+ "for this day");
						tasks[1][count] = task;
						count++;
					}
				}
			} else if (day.equals("WED"))	{
				task = getTask();
				tasks[2][0] = task;
				while (!(keepWriting.equals("y") || keepWriting.equals("Y"))&&count<10) {
					keepWriting = JOptionPane.showInputDialog("Would you like to quit writing "
							+ "tasks for this day? (Press Y for yes or enter to keep going)");
					if (!(keepWriting.equals("y") || keepWriting.equals("Y"))) {
						task = JOptionPane.showInputDialog("Please enter a task you need to do "
								+ "for this day");
						tasks[2][count] = task;
						count++;
					}
				}
			} else if (day.equals("THU")) 	{
				task = getTask();
				tasks[3][0] = task;
				while (!(keepWriting.equals("y") || keepWriting.equals("Y"))&&count<10) {
					keepWriting = JOptionPane.showInputDialog("Would you like to quit writing "
							+ "tasks for this day? (Press Y for yes or enter to keep going)");
					if (!(keepWriting.equals("y") || keepWriting.equals("Y"))) {
						task = JOptionPane.showInputDialog("Please enter a task you need to do "
								+ "for this day");
						tasks[3][count] = task;
						count++;
					}
				}
			} else if (day.equals("FRI")) 	{
				task = getTask();
				tasks[4][0] = task;
				while (!(keepWriting.equals("y") || keepWriting.equals("Y"))&&count<10) {
					keepWriting = JOptionPane.showInputDialog("Would you like to quit writing "
							+ "tasks for this day? (Press Y for yes or enter to keep going)");
					if (!(keepWriting.equals("y") || keepWriting.equals("Y"))) {
						task = JOptionPane.showInputDialog("Please enter a task you need to do "
								+ "for this day");
						tasks[4][count] = task;
						count++;
					}
				}
			} else if (day.equals("SAT")) 	{
				task = getTask();
				tasks[5][0] = task;
				while (!(keepWriting.equals("y") || keepWriting.equals("Y"))&&count<10) {
					keepWriting = JOptionPane.showInputDialog("Would you like to quit writing "
							+ "tasks for this day? (Press Y for yes or enter to keep going)");
					if (!(keepWriting.equals("y") || keepWriting.equals("Y"))) {
						task = JOptionPane.showInputDialog("Please enter a task you need to do "
								+ "for this day");
						tasks[5][count] = task;
						count++;
					}
				}
			} else if (day.equals("SUN")) 	{
				task = getTask();
				tasks[6][0] = task;
				while (!(keepWriting.equals("y") || keepWriting.equals("Y"))&&count<10) {
					keepWriting = JOptionPane.showInputDialog("Would you like to quit writing "
							+ "tasks for this day? (Press Y for yes or enter to keep going)");
					if (!(keepWriting.equals("y") || keepWriting.equals("Y"))) {
						task = JOptionPane.showInputDialog("Please enter a task you need to do "
								+ "for this day");
						tasks[6][count] = task;
						count++;
					}
				}
			}
		}
	}
	
	//this method gets a task from the user
	
	public static String getTask() {
		String task = JOptionPane.showInputDialog("Please enter a task you need to do "
				+ "for this day");
		return task;
	}
}
