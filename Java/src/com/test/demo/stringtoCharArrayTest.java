package com.test.demo;

public class stringtoCharArrayTest {
	
	public static void main(String[] args) {
		String name="PRIYA";
		char[] n=name.toCharArray();
		System.out.println("Difference between String.lenght() and arr.length");
		System.out.println("String.length()"+name.length());
		for(int i=0;i<n.length;i++)
		{
			System.out.println(n[i]);				
		}
	}

}
