/*Printing the reverse of given number
Let us assume the user has inputted the number : 20004000
Then number,j=20004000
reverse : 00040002
 */

package com.test.demo;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String args[])
	{
		int reversenum=0,i=0,j;
		Scanner s =new Scanner(System.in);
	System.out.println("Enter number : ");
	int number=s.nextInt();
	j=number; //j=10
	
	System.out.println(j);
	while(j%10==0)
		{
			i++;
	//		System.out.println("i"+i);
			j=j/10;
//			System.out.println("j"+j);
		}
		
	if(i==0)
		{
		System.out.println("tt");
		i=100;
		}
	
	while(number!=0)
	{
		reversenum = reversenum * 10;
	    reversenum = reversenum + number%10;
        number = number/10;
	}
	System.out.println("The reverse number : ");
	if(i!=100)
	{
		while(i>0)
		{	System.out.print(0);
		i--;
	}}
	System.out.print(reversenum);
		}
}