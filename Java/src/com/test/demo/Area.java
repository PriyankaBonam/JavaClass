package com.test.demo;
import java.util.Scanner;

public class Area {
//defining the Pii as constant in java
	public static final double pii=3.14;
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius r : ");
		float r= s.nextFloat();
		
		//Area of Circle=pirsqUAre
		
		System.out.println("The area of circle is : \n"+pii*r*r);
		
		
	}
}
