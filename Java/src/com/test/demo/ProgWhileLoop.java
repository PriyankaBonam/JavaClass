package com.test.demo;	

//Basic while program

public class ProgWhileLoop {

	public static void main(String args[])
	{
	
		//Initialization 
		int a=10;
		
		//checking the condition : a must be positive
		while (a>0)
		{
			System.out.print(a+"\t");
			a--; // decrement of a by 1 
		}
	System.out.println("\nLoop done :)");	
	}
}
