//Adding sum of numbers in array, by reading the values dynamically
package com.test.demo;
import java.util.Scanner;
public class SumOfElementsInArray {

	public static void main(String args[])
	{
		int b=0;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Array Size :");
		int arraysize=s.nextInt();
		int a[]=new int[arraysize];
		
		for(int i=0;i<arraysize;i++)
		{
		    System.out.println("Enter a["+i+"]");
		    a[i]=s.nextInt();
		    b=a[i]+b;
		    
		}
		System.out.println(b);
	}
	
}
