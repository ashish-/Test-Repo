package Exercise;

import java.io.File;
import java.io.IOException;

public class RunTimeDemo {

	   public static void main(String[] args) {
		   try {

			   // create a new array of 2 strings
			   String[] cmdArray = new String[2];

			   // first argument is the program we want to open
			   cmdArray[0] = "notepad.exe";

			   // second argument is a txt file we want to open with notepad
			  cmdArray[1] = "test.txt";

			   // print a message
			   System.out.println("Executing notepad.exe and opening test.txt");

			   // create a file which contains the directory of the file needed
			   File dir = new File("E:/BigData");

			   // create a process and execute cmdArray and currect environment
			   Process process = Runtime.getRuntime().exec(cmdArray, null, dir);

			   // print another message
			   System.out.println("test.txt should now open.");

		   } catch (IOException ex) {
			   ex.printStackTrace();
		   }

	   }
}
	
