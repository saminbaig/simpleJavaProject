package com.assignments;

public class stringWithNew2 {
	public static void main(String[] args) {
		String s1=new String("python");
		String s2=new String("python");
		String s3=new String("Python");
		String s4="python";
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
