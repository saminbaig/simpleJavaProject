package exceptionHandling;

public class unreachableCatch {
	public static void main(String[] args) {
		try {
			int a=10/0;
		}
		
		catch(ArithmeticException ae) {  //child catch
			System.out.println(ae);
		}
		catch(Exception e) {      //super catch
			System.out.println(e);
		}
		
		
//		catch(NullPointerException ab) {
//			System.out.println(ab);
//		}
	}

}
