/*
1234
123
12
1


1
12
123
1234
 */
package com.test.demo;
import java.util.Scanner;
public class Pyramid2 {

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows=s.nextInt();
		
		for(int i=rows;i>=0;i--)
		{
			for (int j=1;j<=i;j++)
			{
					System.out.print(j);
				}
						System.out.print("\n");
		}
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			
		}
	}
}