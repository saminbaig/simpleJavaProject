package exceptionScenarios;

import java.util.Scanner;

public class throwKayword {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter Roll No:");
		int nmbr = scan.nextInt();
		try {
			
			if(nmbr<0) {
				throw new Exception("Invalid Roll No");
			}
			else {
				System.out.println("Roll No is Valid");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
