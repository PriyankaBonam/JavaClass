package com.test.demo;

public class Block1 {
	
	Block1()
	{
		System.out.println("Inside Constructor : Block 1");
	}
	static
	{
		System.out.println("Static Block : Block 1");
	}
	
	{
		System.out.println("Instance Block : Block 1");
	}
	
public static void main(String args[])
{
	Block1 b=new Block1();
}

}
