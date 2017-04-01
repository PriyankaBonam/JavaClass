package com.test.demo;

public class DataTypedDeclaration {
	
public static void main(String args[])
{
	int a; // a is declared
	a=10; //Initialisation of a
	System.out.println("first\n"+a);
	a=a++; // Reinitialisation of a
	System.out.print("second\n"+a);
	a=++a; 
	System.out.print("\nthird\n"+a); //Usage of a	
}
}
