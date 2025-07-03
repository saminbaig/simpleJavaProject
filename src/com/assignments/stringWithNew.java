package com.assignments;

public class stringWithNew {
	public static void main(String[] args) {
	
		String s1=new String("sameen");
		String s2=new String("sameen");
		String s3=new String("Sameen");
		String s4="sameen";
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		System.out.println(s1==s4);
		
		System.out.println("-----------------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equals(s4));
		
	}

}
