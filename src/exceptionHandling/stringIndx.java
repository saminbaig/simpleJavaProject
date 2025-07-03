package exceptionHandling;

public class stringIndx {
	public static void main(String[] args) {
		String s="Sam";

		try {
			System.out.println("char of 6th location "+s.charAt(6));
		}
		catch(Exception e) {
			System.out.println("you are trying out of length char ");
		}
       System.out.println("The Rest of the codes");
	}
}