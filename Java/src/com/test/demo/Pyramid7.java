/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

 */
package com.test.demo;
import java.util.Scanner;
public class Pyramid7 {
	public static void main(String args[])
	{
		int k=1,x,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter rows : ");
		int rows=s.nextInt();
		for(int i=1;i<=rows;i++)
		 {
		   k=rows-1;
		  System.out.print(i+"\t");
		  x=i;
		  for(j=2;j<=i;j++)
		  {
			  System.out.print(x+k+"\t");
		   x=x+k;
		   k--;
		  }
		  System.out.println("\n");
		 }
	}
	

}

