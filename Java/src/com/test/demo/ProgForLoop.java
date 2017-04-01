package com.test.demo;

public class ProgForLoop {
	public static void main(String args[])
	{
	  //Declaration
		int i,j,z;
		
		// basic for loop for odd and even numbers
		for(i=5; i>1; i--)
		{
			if (i%2==1)
			System.out.println("Odd:" +i);
			else
			System.out.println("Even:" +i);	
		}
		
		//for loop without Initialisation 
		System.out.println("Without Initialization");
		for( ; i <10 ; i ++)
		{
		System.out.print(i+"\t");		
		}
		
		//Usage of For Loop as in While Loop ie, without initialization and counter
		System.out.println("\nUsage of For Loop as in While Loop");
		for( ; i>1 ;)
		{
		System.out.print(i+"\t");
		i--;
		}
		System.out.println("\n");
		/*
		 Printing
		  *
		  * *
		  * * *
		  * * * *
		  * * * * *
		 */
		
		for(i=1;i<6; i ++)
		{
		  for (j=1;j<=i;j++)
		  {
			  System.out.print("* ");
		  }
		  System.out.println("\n");
		}
		
		
	
	/*Printing
	 $
	    $  
	 $     $
	    $
	 $ 
	 */
	
	for (i=1;i< 10; i++)
	{
		for (j=1;j<=i;j++)
		{
			if(i%2==1)
			{
			if(j%2==1)
				System.out.print("$");
			else
				System.out.print("\t");
			}
			else
			{
				if(j%2==1)
					System.out.print("\t");
				else
					System.out.print("$");
		
			}
		}
		System.out.println();
	}
	
 }
}
	



