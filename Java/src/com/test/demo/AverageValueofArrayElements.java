package com.test.demo;
import java.util.Scanner;

public class AverageValueofArrayElements {

	public static void main(String args[])
	{
		int b=0;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Array Size : ");
		int ArraySize=s.nextInt();
		int a[]=new int[ArraySize];
		for(int i=0; i<ArraySize;i++)
		{
			System.out.println("Enter a["+i+"]");
			a[i]=s.nextInt();
            b=b+a[i];
		}
		b=b/ArraySize;
		System.out.println("The average : "+b);
	}
}
