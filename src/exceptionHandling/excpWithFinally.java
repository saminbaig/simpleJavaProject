package exceptionHandling;

public class excpWithFinally {
	public static void main(String[] args) {
		String str="java";
		try {
			System.out.println(str.charAt(7));
		}
		
		catch(Exception e) {
			System.out.println(e);
			System.out.println("exception handled");
		}
		
		finally {
			System.out.println("finally block is always excecuted");
		}
	}

}
