package exceptionHandling;

public class nullPointer {
	public static void main(String[] args) {
		String s1=null;
		
		try {
			System.out.println(s1.length()); 
			System.out.println(s1.charAt(2));

		}
		
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Exception Handled");
		}
		
		System.out.println("The Rest of the codes");
	}

}
