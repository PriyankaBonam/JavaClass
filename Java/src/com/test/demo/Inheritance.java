// Final and Static are not inherited 
package com.test.demo;

class A {
	// we cannot write static/final variable inside a function
	static int i=20;
	final double pi=3.14;
	void printA()
	{
		System.out.println("Inside : Inheritance Class");
		i=10;
	    System.out.println("Class Inheritance Abort");	
	}

}

class B extends A
{
	int j;
	
	 static void print()
	 {
		  B b=new B();
		 System.out.println("Inside : Class B : Function print()");
		 System.out.println(B.i);
		 System.out.println(b.pi);
		  b.j =20;
		 System.out.println(b.j);
		 System.out.println("Print Function : Class A");
		 b.printA();
	 }
	}


public class Inheritance extends B
{
	public static void main(String args[])
	{
		System.out.println("Inside funtion : main()");
// we cannot extend final variable 
		Inheritance I=new Inheritance();
		 System.out.println("pi:"+I.pi);
		 
		 System.out.println("i:"+Inheritance.i);
		  System.out.println("j"+I.j);
		 int k =10;
		 System.out.println("Abort Class : Inheritance");
		 System.out.println("k"+k);
		 System.out.println("Print Function: Class B");
		Inheritance.print();
			
	}
	
}
