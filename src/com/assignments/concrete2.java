package com.assignments;

public class concrete2 extends abstrct2{

	
	public void start() {
		System.out.println("car is starting");
		
	}

	
	public void running() {
		System.out.println("car is running");
		
	}
	
	public static void main(String[] args) {
	   concrete2 con2=new concrete2();
	   con2.start();
	   con2.running();
	   con2.stop();
	   
	}

}
