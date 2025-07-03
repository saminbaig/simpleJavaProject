package exceptionHandling;

public class withoutExoWithFinally {
	public static void main(String[] args) {
		int x=20;
		int y=0;
			
		try {
			int z=x/y;
			System.out.println("Result "+z);
		}
		
		catch(Exception e){
			System.out.println("Arithamtic excp handled");
		}
		
		finally {
			System.out.println("finally block is always excecuted");
		}
		
		System.out.println("Hello");
	}

}
