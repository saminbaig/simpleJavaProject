package exceptionAssignments;

import java.util.Scanner;

public class throwExmple {
	public static void main(String[] args) {
		System.out.println("Enter Your Password: ");
		
		Scanner sc=new Scanner(System.in); //scanner class is for taking input from user
		String pass = sc.next();           //pass variable stores string from user
		try {
			if(pass.length()<6) {
				throw new Exception("Password length must be atleat 6 character");
			}
			else {
				System.out.println("Password is valid");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("The Rest of Codes");
	}

}
