package com.test.demo;

public class Block2 extends Block1{
	Block2()
	{
		System.out.println("Contructor : Block 2");
	}
	static
	{
	 	System.out.println(" Static Block : Block 2");
	}
	
	{
		System.out.println("Instance Block : Block 2");
	}
	
	public static void main(String args[])
	{
		Block2 b= new Block2();
	}
	
}
	