package exceptionAssignments;

public class mulTryCatch2 {
	public static void main(String[] args) {
		
		try {
			String s="samin";
			System.out.println("Index of 7th index"+s.charAt(7));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("StringIndexOutOfBoundsException handled");
			
		}
		
		try {
			int a=20/0;
			System.out.println("Result"+a);
		}
		catch(ArithmeticException ar){
			System.out.println(ar);
			System.out.println("ArithmeticException handled");
		}
		try {
			int[] arr=new int[3];
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException ao) {
			System.out.println("ArrayIndexOutOfBoundsException handled");
			ao.printStackTrace();
		}
		
		System.out.println("all exceptions handled");
	}

}
