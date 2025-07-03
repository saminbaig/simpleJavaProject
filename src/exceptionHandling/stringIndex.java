package exceptionHandling;

public class stringIndex {
	public static void main(String[] args) {
		String s="Ram";
		
		try {
		System.out.println("char of 6th location "+s.charAt(6));
	}
		catch(Exception e) {
			System.out.println("you are trying out of length char ");
		}
	
		}

}
