package com.assignments;

public class stringmethods {
	public static void main(String[] args) {
		
		String str="India is developing country";
		
		
		System.out.println(str.indexOf('i'));
		System.out.println(str.lastIndexOf('i'));
		
		//checking index of second i of india
		System.out.println(str.substring(0,4).indexOf('i')); 
		
		System.out.println("Length ="+str.length());
		System.out.println(str.indexOf('y'));
		System.out.println(str.lastIndexOf('t'));
		System.out.println(str.startsWith("India is"));
		System.out.println(str.endsWith("country"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}

}
