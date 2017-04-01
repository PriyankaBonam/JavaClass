package com.test.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBuffer {
 
	
	  BufferedReader br;
	void testFunction() throws FileNotFoundException {
	
		FileReader fr = null;
		String sCurrentLine="sCurrentLine";
		fr = new FileReader("C:\\Users\\inpbonam\\Desktop\\java.txt");
		try {	

			br = new BufferedReader(fr);
			System.out.println(sCurrentLine);
			
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(br.readLine());
				System.out.println(sCurrentLine);
			}

		} 
		catch (IOException e) {

			   e.printStackTrace();
		} 	
		catch (Exception e)
		{
			e.printStackTrace();
		}
	finally
	{
		try
		{
			if(sCurrentLine!=null)
		    fr.close();
		if((br.readLine())!=null)
			br.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	}
	public static void main(String[] args) throws FileNotFoundException {
		
		TestBuffer b=new TestBuffer();
		b.testFunction();
	}

	}

	














