package com.test.demo;

import java.util.Scanner;

public class DynamicArray {


	public static void main(String args[])
	{
		int size,i;
		 Double d;
		Scanner s;
		try
		{
			System.out.println("Enter the size of array:");
   s=new Scanner(System.in);
		
		d=(double) s.nextDouble();
		size=d.intValue();	
		int a[]=new int[size];
		for (i=0;i<size;i++)
		{
			int k =i+1;
			System.out.println("Enter the value of a["+k+"]");
		      d=(double) s.nextDouble();
		    a[i]=d.intValue();
		}
		System.out.println("Array Values : ");
		for (i=0;i<size;i++)
		{
			System.out.println("a["+i+"] :  "+a[i]);
		}  
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
