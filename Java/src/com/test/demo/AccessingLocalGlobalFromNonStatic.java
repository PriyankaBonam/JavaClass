package com.test.demo;

public class AccessingLocalGlobalFromNonStatic {
	// Declaring a non static global variable i 
		int i;
	   /* We cannot assign the value for non static global variable in the same class
	      If we want to assign then we need to assign it from another function
	    */
		
		// Declaring and assigning the non static global variable
		int j=10;
		
		//Declaring a static variable
		 static int k;
			 
		 //Declaring and assigning value for static global variable
		 static int l=20;
		 
		 //creating a void non static instance function
		 void nonStaticVoid()
		 {
			 System.out.println("In function : nonStaticVoidFunction()");
			 //Since the function is declared as void, the function does not return anything 
			 //so there is no return statement in the function
		 }
		 
		 //creating a non static function of return type : int
		 int nonStaticInt()
		 {
			int i=0;
			System.out.println("In function : nonStaticInt()");
			//Creating an object for the class
			AccessingLocalGlobalFromNonStatic b=new AccessingLocalGlobalFromNonStatic();
			//Accessing the global non static variable
			System.out.println("Non Static Variable : "+b.j);
			//Accessing static variable
			System.out.println("Static variable"+AccessingLocalGlobalFromNonStatic.l);
			//calling an Non Static Void
			b.nonStaticVoid();
			//calling a Static Void
			AccessingLocalGlobalFromNonStatic.staticVoid();
			//calling a StaticInt
			i= AccessingLocalGlobalFromNonStatic.staticInt();
			System.out.println("Returnvalue of StaticInt"+i);
			//returning the value of i
			System.out.println(i);
			return i;
		 }
		 
		 //creating a static function of return type : void
		 static void staticVoid()
		 {
			 System.out.println("Inside function : staticVoid");
		 }
		 
		 //creating a static function of return type : int
		 static int staticInt()
		 {
			 int i=20;
			 System.out.println("Inside the function : staticInt()");
			 //returning the local variable
			 return(i);
		 }
		 
		 public static void main(String args[])
		 {
			 System.out.println("Inside Main");
			 AccessingLocalGlobalFromNonStatic a=new AccessingLocalGlobalFromNonStatic();
			 a.nonStaticInt();
			 
		 }			 
		 }
		
		
		
		
		

	

