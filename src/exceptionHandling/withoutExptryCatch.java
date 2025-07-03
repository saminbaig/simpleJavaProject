package exceptionHandling;

public class withoutExptryCatch {
	public static void main(String[] args) {
		int x=50;
		int y=2;
		
		try {
			int z=x/y;
			System.out.println("Result "+z);
		}
		
		catch(Exception e) {     //catch block wont excecute
			System.out.println("Arithamtic exp handled");
		}
		
		
		System.out.println("Good Afternoon");
	}

}
