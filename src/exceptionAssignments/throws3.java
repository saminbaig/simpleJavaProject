package exceptionAssignments;

import java.util.Scanner;

public class throws3 {
	
	public void getString(String str) throws StringIndexOutOfBoundsException  {
		System.out.println(str.charAt(5));
	}
	
	public static void main(String[] args) {
		System.out.println("Enter any string more than 3 character: ");
		Scanner scan=new Scanner(System.in);
		String str = scan.next();
		throws3 thr=new throws3();
		thr.getString(str);
		System.out.println("rest of codes");
	}
 
}
