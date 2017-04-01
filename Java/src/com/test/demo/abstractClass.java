package com.test.demo;

public class abstractClass extends C1

{
  static
  {
	  System.out.println("Inside the Static Block of Normal Class");
  }
  
  {
	  System.out.println("Inside the Non Static Block of Normal Class");
  }
  
  abstractClass()
  {
	  System.out.println("Inside the Constrcutor of Normal Class");
  }
  
  public static void main(String args[])
  {
	  abstractClass a=new abstractClass();
  }
	
}

abstract class C1
{
	C1()
	{
		System.out.println("Inside the Constrcutor of Abstract Class");
	}
	
	{
		System.out.println("Inside the Non Static block of Abstract Class");	
	}
	
	static
	{
		System.out.println("Inside the Static block of Abstract Class");
	}
}
