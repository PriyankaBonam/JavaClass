/*
 1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1 
1 0 1 0 1 0 1 
 */

package com.test.demo;
import java.util.Scanner;
public class Pyramid4 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Rows : ");
		int rows=s.nextInt();
		int k=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<=k;j++)
			{
			 
			if(i==0)
				System.out.print("1");
			if(j%2==0 && i!=0)
				 System.out.print("0");
			 if((j%2==1 && i!=0))
				 System.out.print("1");
			}
			k++;
			System.out.println("");
		}
	}
	

}
