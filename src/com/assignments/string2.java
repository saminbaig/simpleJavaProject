package com.assignments;

public class string2 {
	public static void main(String[] args) {
		String s1="animal";
		String s2="animal";
		String s3="Animal";
		String s4="Tiger";
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		
		
		System.out.println("------------------");
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.concat(" "+s4));
		System.out.println(s2.concat(" Lion"));
		System.out.println("birds ".concat("peacock"));
		
	}

}
