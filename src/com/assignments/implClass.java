package com.assignments;

public class implClass implements interface1 {

	
	public void home() {
		System.out.println("2BHK");
		
	}

	
	public void mobile() {
		System.out.println("Samsung");
		
	}

	
	public void bike() {
		System.out.println("Honda");
		
	}
	
	public static void main(String[] args) {
		implClass imp=new implClass();
		imp.home();
		imp.mobile();
		imp.bike();
	}

}
