/*

         *
       * *
     * * *
   * * * *
 * * * * *
 
 */
package com.test.demo;
import java.util.Scanner;
public class Pyramid6 {
	public static void main(String args[])
	{
		   int spaces=0;
		   System.out.println("Enter rows : ");
		   Scanner s=new Scanner(System.in);
		   int rows=s.nextInt();
		   int p=rows;
		   for(int i=1;i<=rows;i++)
		   {
			   spaces=p-1;
			   for(int j=0;j<spaces;j++)
			   {
				   System.out.print(" ");
			   }
			   for(int k=1;k<=i;k++)
			   {
				   System.out.print("*");
			   }
			   System.out.println("");
			   p--;
			   
		   }
		
	}
}