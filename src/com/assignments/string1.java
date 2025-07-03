package com.assignments;

public class string1 {
	public static void main(String[] args) {
	
	String s1="city";
	String s2="city";
	String s3="CITY";
	
	System.out.println(s1.length());
	
	System.out.println(s1==s2);  //check addrss
	System.out.println(s1==s3);
	System.out.println(s2==s3);
	System.out.println("----------------");
	System.out.println(s1.equals(s2));  //check info
	System.out.println(s1.equals(s3));
	System.out.println(s2.equalsIgnoreCase(s3));  //check info ignore case
	
	}

}
