package com.test.demo;
//for reading the input from keyboard Scanner package is imported
/*
 let us assume
 we have entered number : 2
 Limit : 3
 the result must be 2power 3 = 8 
 */
import java.util.Scanner;

public class Powerofnumber {
	public static void main(String args[])
	{
			//Create an Object to the scanner class to read input from console
		Scanner S= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=S.nextInt();
		System.out.println("Enter the limit:");
		int limit=S.nextInt();
		int compoundvalue=number;
		for (int i=1; i <limit;i++)
		{
			compoundvalue=compoundvalue*number;		
		}
		System.out.println("The value of "+number+" power "+limit+"is : "+compoundvalue);
	}
}
