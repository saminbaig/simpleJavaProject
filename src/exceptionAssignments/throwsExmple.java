package exceptionAssignments;

import java.util.Scanner;

public class throwsExmple {
	public void devide(int num1,int num2) throws ArithmeticException {
		int result=num1/num2;
		System.out.println("Result "+result);
	}

	public static void main(String[] args) {
		System.out.println("Enter first num: ");
		Scanner sc=new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		try {
			throwsExmple thr=new throwsExmple();
			thr.devide(num1, num2);
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("The Rest of the codes");


	}
}