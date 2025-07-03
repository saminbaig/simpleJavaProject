package exceptionAssignments;

import java.util.Scanner;

public class throw3Main {
	public static void main(String[] args) {
		System.out.println("Enter any string more than 3 character: ");
		Scanner scan=new Scanner(System.in);
		String str = scan.next();
		throws3 thr=new throws3();
		try {
			thr.getString(str);
		}
		catch(StringIndexOutOfBoundsException si) {
			System.out.println(si.getMessage());
			System.out.println("Exception handle");
		}
		
		System.out.println("rest of codes");
		System.out.println("Hello");
	}

}
