package com.test.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BufferedDelimiter {

	private static Scanner s;
	
	public static void main(String args[]) 
	{
		BufferedReader br;
		System.out.println("Enter the path of file");
		s = new Scanner(System.in);
		String file;
		file=s.next();
		try {
			br = new BufferedReader(new FileReader(file));
			String line=null;
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
				StringTokenizer str=new StringTokenizer(line,",");
				while(str.hasMoreElements())
				{
					System.out.println(str.nextElement());
				}				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
