package exceptionHandling;

public class Arithmatic {
	
	public static void main(String[] args) {
		int a=10; 
		int b=0;

		try {
			int c=a/b;             //code which will throw exception
			System.out.println("Result "+c);
		}
		
		catch(Exception e){        //catch block excecute 
			System.out.println("Arithamtic exp handled");
			System.out.println(e);

		}
		
		System.out.println("The Rest of codes");
		System.out.println("Hello world");
	}

}
