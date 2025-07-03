package exceptionHandling;

public class finallyWithExit {
	public static void main(String[] args) {
		int a=10; 
		int b=0;

		try {
			int c=a/b;             //code which will throw exception
			System.out.println("Result "+c);
		}

		catch(Exception e) {  //catch block excecute 
			System.out.println("Arithamtic exp handled");
			System.out.println(e);
			System.exit(0);   //due to this exit method finally block is not executed
		}
		
		finally {
			System.out.println("inside finally block");
		}
		System.out.println("GM");
	}
}
