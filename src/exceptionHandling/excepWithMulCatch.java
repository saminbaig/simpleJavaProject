package exceptionHandling;

public class excepWithMulCatch {
	public static void main(String[] args) {
		String s="samin";
		int a=10;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println("Result "+c);
			System.out.println("char of 7th location"+s.charAt(7));
			
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("GA");
		}
		
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
		catch(Exception e) {
			System.out.println("hamdle any other excption");
		}
		finally {
			System.out.println("finally");
		}
		
		System.out.println("Hello");
	}

}
