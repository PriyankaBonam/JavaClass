import java.util.Scanner; 

package com.test.demo;
public class ScannerWithDelimiter {

	public static void main(String args[])
	{
			//Create an Object to the scanner class with delimiter
		String input = "10 tea 20 coffee 30 tea buiscuits";  
	     Scanner s = new Scanner(input).useDelimiter("\\s");  
	     System.out.println(s.nextInt());  
	     System.out.println(s.next());  
	     System.out.println(s.nextInt());  
	     System.out.println(s.next());  
	     s.close();   
		
			}
}
	
	
	  
