package exceptionAssignments;

import java.util.Scanner;

public class throwsKeyword    {
	
	public void devide(int num1,int num2) {
		int result=num1/num2;
		System.out.println("Result "+result);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter first num: ");
		Scanner sc=new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try {
			throwsKeyword thr=new throwsKeyword();
			thr.devide(num1, num2);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("rest code");
		
	}

}
