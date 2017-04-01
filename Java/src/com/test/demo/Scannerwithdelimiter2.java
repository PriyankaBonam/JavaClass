import java.util.Scanner;
package com.test.demo;
	public class Scannerwithdelimiter2 {

	   public static void main(String[] args) {

	   String s = "Hello World! 3 + 3.0 = 6.0 true ";

	   // create a new scanner with the specified String Object
	   Scanner scanner = new Scanner(s);   
	   // change the delimiter of this scanner
	   scanner.useDelimiter("World");
	   	   // display the new delimiter
	   System.out.println("" + scanner.delimiter());
	   System.out.println("" + scanner.next());
	   	   // print a line of the scanner
	   System.out.println("" + scanner.nextLine());
	   // close the scanner
	   scanner.close();
	   }
} 

