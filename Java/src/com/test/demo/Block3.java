package com.test.demo;

public class Block3 extends Block1{
		Block3()
		{
			System.out.println("Contructor : Block 3");
		}
		static
		{
			System.out.println(" Static Block : Block 3");
		}
		
		{
			System.out.println("Instance Block : Block 3");
		}
		
		public static void main(String args[])
		{
			Block1 b= new Block1();
		}
		
	}
		


