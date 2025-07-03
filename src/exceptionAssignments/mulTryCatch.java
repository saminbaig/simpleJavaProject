package exceptionAssignments;

public class mulTryCatch {
	public static void main(String[] args) {
		//multipe try and catch block 
		try {
			String s1=null;
			String s2="samin";
			System.out.println("String length"+s1.length());  //nullPointer exception
			System.out.println(s2.charAt(7));
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			
			
		}
		try {
			int a=10/0;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
			System.out.println(ae.getMessage());
			
		}
		System.out.println("Hello");
	}

}
