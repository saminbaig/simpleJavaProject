package exceptionAssignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class compileTime {
	void readFile() throws FileNotFoundException //throws used with method signature 
	//throws is used for bypass the exception only and not for handle
	{
		FileInputStream file=new FileInputStream("d:/abc.txt");

	}

	void saveFile() throws FileNotFoundException //throws used with method signature
	{
		FileOutputStream file2=new FileOutputStream("d:/xyz.txt");
	}

	public static void main(String[] args) {  // exception is handle in this caller method using try catch
		compileTime ct=new compileTime();
		try {
			ct.readFile();   //risky code in try block
			ct.saveFile();  //risky code in try block
		}
		catch(FileNotFoundException e) {   // e is a ref variable
			System.out.println(e);
			System.out.println("handled");
			e.printStackTrace();  //printStackTrace method is used here to get fully qualified details of an exception
		}

		System.out.println("rest of code");
	}
}
