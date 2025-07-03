package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class simpleChecked {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream file=new FileInputStream("d:/abc.txt");
		
	}

}
