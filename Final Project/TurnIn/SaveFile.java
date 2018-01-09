//Brandon Edwards
//SaveFile.java
//11/28/17
//honor code: I pledge that this submission is solely my work,
//and that I have neither given to nor received help from anyone
//other than the instructor or TAs.
import java.io.IOException;//For exception handling
import java.io.File;//The file to be written: save.txt
import java.io.PrintWriter;//printwriter object for simplesetname method

//a class to manage how save files are created, written to, and read from
public class SaveFile{
    
	File save = new File("Save.txt");//the file that is going to be used
   
   //init a printWriter to be used in File output of the users name
   PrintWriter simpleWriter = new PrintWriter(save);
	
   public SaveFile() throws IOException{
   }
	//a method to close the reader and writer when you're done with them
	//to free up memory
	public void close() throws IOException{
      simpleWriter.close();
	}
	
   // a method to use a printwriter object to print a name to a file
   // the text will be overwritten then next time this method is called
	public void simpleSetName(String name){
            simpleWriter.print(name);
        }
}
