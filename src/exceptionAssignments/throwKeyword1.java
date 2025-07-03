package exceptionAssignments;

import java.util.Scanner;

public class throwKeyword1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		try {
			if(age<18) {
				throw new Exception("You are not eligible voting");
			}
			else {
				System.out.println("You are eligible voting");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}
