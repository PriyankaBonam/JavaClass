package com.test.demo;
import java.util.Scanner;
public class Overview {
	public static void main(String args[])
	{
	//right shift of binary number
		System.out.println("Enter number : ");
		Scanner s =new Scanner(System.in);	
		int num=s.nextInt();
		int a[]= new int [10];
		int i=0,x=1;
		while(x==1)
		{
	   	 x=num%2;
			a[i]=x;
			System.out.println(a[i]);
			System.out.println(x);
			num=num/10;
			i++;
		}
		if(x<=0)
			a[i]=1;
			
		int b[]=new int[i];
		int j=0;
		
		while(i>=0)
		{
			b[j]=a[i];
			i--;
			j++;
		}
		for(i=0;i<j;i++)
		{
			System.out.println("a[i]/b[i]"+a[i]+"\n"+b[i]);
		}
		
		
	}

}
