package com.assignments;

public class concrt extends abstrct {

	
	public void m1() {
		System.out.println("m1 running in concrete class");
		
	}

	
	public void m2() {
		System.out.println("m2 running in concrete class");
		
	}
	
	public static void main(String[] args) {
		concrt con=new concrt();
		con.m1();
		con.m2();
		con.m3();
	}

}
