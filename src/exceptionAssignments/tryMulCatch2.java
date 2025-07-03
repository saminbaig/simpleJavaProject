package exceptionAssignments;

public class tryMulCatch2 {
	public static void main(String[] args) {
		
		try {
			int d=20/0;
			String sr=null;
			System.out.println(sr.length());
			int[] ar=new int[8];
			System.out.println(ar[10]);
		}	
		
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
	
		
		catch(NullPointerException ne) {
			System.out.println(ne.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai.getMessage());
		}
		
		System.out.println("Rest of the code");
				
	}
	
}
