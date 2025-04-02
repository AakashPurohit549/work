package exceptionhandling;


import java.io.*;


//try with resource
public class PracticeExceptionTryWithRResorce {
	
public static void main(String[] args) {
	try(PrintWriter writer = new PrintWriter(new File("test.txt"))){
		writer.println("This sholid create a new file");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
}
