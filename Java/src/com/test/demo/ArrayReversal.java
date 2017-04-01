package com.test.demo;

import java.util.Scanner;

public class ArrayReversal {

	public static void main(String args[])
	{
		int size,i;
		System.out.println("Enter the size of Array");
		Scanner s;
		s=new Scanner(System.in);
		size=s.nextInt();
		int a[]=new int[size];
		for(i=0;i<size;i++)
		{
			System.out.println("Enter the value of a["+(i+1)+"]");
			a[i]=s.nextInt();
		}
		for(i=size-1;i>=0;i--)
		{
			System.out.print("Enter the value of a["+(i+1)+"] : "+a[i]+"\n");
			}
		
	}
}
