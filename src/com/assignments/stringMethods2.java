package com.assignments;

public class stringMethods2 {
	
	public static void main(String[] args) {
		String s="My Name Is Sameen";
		
		System.out.println("Length ="+s.length());
		System.out.println(s.indexOf('y'));
		System.out.println(s.lastIndexOf('m'));
		System.out.println(s.indexOf('s'));
		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.startsWith("My"));
		System.out.println(s.endsWith("een"));
		System.out.println(s.endsWith("Sam"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println("-------------------------");
		
		String s1=new String("he is a software engineer");
		
		System.out.println("Length ="+s1.length());
		System.out.println(s1.indexOf('w'));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.startsWith("he"));
		System.out.println(s.endsWith("eer"));
		System.out.println(s.endsWith("eng"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		
	}

}
