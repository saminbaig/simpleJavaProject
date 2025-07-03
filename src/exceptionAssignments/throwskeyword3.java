package exceptionAssignments;

import java.util.Scanner;

public class throwskeyword3  {
	public void devide(int num1,int num2) throws ArithmeticException {
		int result=num1/num2;
		System.out.println("Result "+result);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter first num: ");
		Scanner sc=new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		throwsKeyword th=new throwsKeyword();
		th.devide(num1, num2);
		System.out.println("rest code");
		
	}

}
