package com.test.demo;

public class RetArray {
	public static void main(String[] args) {
		
		int b[]= new int [10];
		
		C a1=new C();
		b=a1.fun();
		System.out.println(b[1]);
		System.out.println(b[2]);
		
	}
}
	class C
	{
	int []	fun()
		{
			int a[]=new int[10];
			a[1]=10;
			a[2]=20;
			return a;
		}
	}

