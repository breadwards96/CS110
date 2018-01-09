//Brandon Edwards
//SaveFile.java
//10/30/17
//honor code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.io.PrintWriter;

//a class to manage how save files are created, written to, and read from
public class SaveFile {
    
	File save = new File("Save.txt");//the file that is going to be used
	
	//the standard open option that bufferedwriter is going to use
	OpenOption opt = StandardOpenOption.CREATE; 
	
	//the character set that both reader and writer
	Charset set = Charset.forName("UTF-8");
	
	//the path object that converts the file into a path for the reader and writer
	Path path = save.toPath();
	
	//init of a buffered reader and writer to read from and write to the file
	BufferedWriter writer = Files.newBufferedWriter(path, set, opt);
	BufferedReader reader = Files.newBufferedReader(path, set);
   
   //init a printWriter to be used in File output of the users name
   PrintWriter simpleWriter = new PrintWriter(save);
	
	//a constructor for the save file class that throws exceptions and takes no arguments
	public SaveFile() throws IOException{	
	}
	
	//a method for the savefile class that checks for the "existence" of a file
	//and returns a boolean
	public boolean exists() throws IOException{
		boolean exist = false;
			//the writer automatically creates the file when it is initialized so
			//so this if statement must be used to check if the file is empty or not
					if(Files.size(path) > 0){
						exist = true;
					}else{
						exist = false;
				}
					return exist;
		
	}
	
	/* a commented method that was going to set the score in the save file
	 *but reader doesn't have a nextInt() method so it would be too much work
	 *for this project
	public void setScore(int score) throws IOException{
		writer.newLine();
		writer.write(score);
	}
	*/
	
	//a method to read the savefile and return any string in it
	//which should only be the players name
	public String getName(){
		String name = null;
		try {
			 name = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return name;
	}
	
	//a method to set the name in the savefile
	//right now this shouldn't be called more than once or else it'll have multiple names output
	//which works for this project
	public void setName(String name) throws IOException{
		writer.write(name);
	}
	
	//a method to close the reader and writer when you're done with them
	//to free up memory
	public void close() throws IOException{
		writer.close();
		reader.close();
      simpleWriter.close();
	}
	
   // a method to use a printwriter to print a name to a file
   // the text will be overwritten then next time this method is called
	public void simpleSetName(String name){
            simpleWriter.print(name);
        }
}
