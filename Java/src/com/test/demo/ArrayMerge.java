package com.test.demo;

import java.util.Scanner;

public class ArrayMerge {

	

	public static void main(String args[])
	{
		int size1,size2,i;
	
		System.out.println("Enter the size of array1 : ");
		Scanner s;
		s=new Scanner(System.in);
		
		size1 = s.nextInt();
		int[] a=new int[size1];
		for(i=0;i<size1;i++)
		{
			System.out.println("a["+i+"] : ");
			a[i]=s.nextInt();	
		}
		System.out.println("Enter the size of array2 : ");
		size2 = s.nextInt();
		int[] b=new int[size2];
		for(i=0;i<size2;i++)
		{
			System.out.println("b["+i+"] : ");
			b[i]=s.nextInt();	
		}
		int[] merge = new int[size1+size2];
		i=0;
		while(i<size1)
		{
			merge[i]=a[i];
			i++;
		}
		int j=0;
		while(j<size2)
		{
			merge[i]=b[j];
			i++;
			j++;
			
		}
		for(i=0;i<(size1+size2);i++)
		{
			System.out.print("merge["+i+"] :"+merge[i]+"\n");
			
		}
		
		
		
		
		
		
	}
}
