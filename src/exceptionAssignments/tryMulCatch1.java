package exceptionAssignments;

public class tryMulCatch1 {
	public static void main(String[] args) {
		try {
			//the codes that throws exceptions(Arithmatic,StringIndex, nullPointer)
			int a=10/0;     
			System.out.println("Result "+a);
			String s="india";
			System.out.println("Character of 8th location "+s.charAt(8));
			String str=null;
			System.out.println("String length "+str.length());
			
			
		}
		catch(ArithmeticException a) {
			System.out.println(a.getMessage());
			
		}
		catch(StringIndexOutOfBoundsException b) {
			System.out.println(b.getMessage());
		}
		catch(NullPointerException c) {
			System.out.println(c.getMessage());
		}
	}

}
