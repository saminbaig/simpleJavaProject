package com.assignments;

public class circle implements interface2 {
	private double radius;
	
	//constructor to set the radius of the circle or to initialise the variable
	public circle(double radius) {
		this.radius=radius;
		
	}
	//implementing the area method
	public double area() {
		return Math.PI*radius*radius;  //Area of circle=PI*r*r
		
	}
	public static void main(String[] args) {
		circle c=new circle(15);
		System.out.println("Area of circle is "+c.area());
		
	}
	
	
	

}
