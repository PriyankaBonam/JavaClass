package com.test.demo;

public class AccessingLocalGlobalFromStatic {
	
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
			 }
		 
		 //creating a non static function of return type : int
		 int nonStaticInt()
		 {
			int i=0;
			System.out.println("In function : nonStaticInt()");
			System.out.println("i"+i);
			
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
			 System.out.println("i"+i);
			
			 //Printing the Static Global Variable in Static Function
			 System.out.println("l"+AccessingLocalGlobalFromStatic.l);
			 //Creating an object to the class
			 AccessingLocalGlobalFromStatic a=new AccessingLocalGlobalFromStatic();
			
			//Printing the global variable in StaticInt Function
			 System.out.println("j"+a.j);
			 
			 //Calling Non Static Function from the Static Function
			 a.nonStaticVoid();
			 i=a.nonStaticInt();
			 System.out.println("nonStaticIntReturn :"+i);
			 
			 //Calling a Static function from a static function
			 AccessingLocalGlobalFromStatic.staticVoid();
			 			 
			 
			 //returning the local variable
			 return(i);
		 }
		 
		 public static void main(String args[])
		 {
			int i= AccessingLocalGlobalFromStatic.staticInt();
			System.out.println("Main"+i);
		 }
		
		
		
		
		
	}



