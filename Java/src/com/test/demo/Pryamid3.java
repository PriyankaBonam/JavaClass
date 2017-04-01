package com.test.demo;

/*
1
2 3
4 5 6 
7 8 9 10
7 8 9 10 
4 5 6
2 3
1
*/

public class Pryamid3
{
	public static void main(String args[])
	{
    	int k =1,j;
    
		for(int i=1;i<=4;i++)
		{
			for( j=1;j<=i;j++)
			{
				System.out.print(k+"\t");
				k++;				
			}
			System.out.println();
		}
		j=4;
		for(int i=4;i>0;i--)
		{
			k=k-j;
			for(j=1;j<=i;j++)
			{
				
				System.out.print(k+"\t");
				k++;				
			}
			System.out.println();
		}
		
	}

}
