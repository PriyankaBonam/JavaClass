/*
 1
 2 2
 3 3 3
 4 4 4 4
 */
package com.test.demo;
import java.util.Scanner;
public class Pyramid1 {

	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number of rows to be displayed:");
		int rows=s.nextInt();
		
		for(int i=1;i<=rows;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
		System.out.println();
		}
		
	}

}

