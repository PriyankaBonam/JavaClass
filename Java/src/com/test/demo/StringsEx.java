package com.test.demo;

public class StringsEx {
	public static void main(String[] args) {
		//Program to list the operations available with Strings
	String name="PRIYA";
	String nameSmall="priya";
	System.out.println("priya==PRIYA?"+nameSmall.equals(name));
	System.out.println("priya==PRIYA? ignoreing case-"+nameSmall.equalsIgnoreCase(name));
	System.out.println("priya starts with pri?"+nameSmall.startsWith("pri"));
	System.out.println("priya starts with PRI?"+nameSmall.startsWith("PRI"));
	System.out.println("priya ends with pr?"+nameSmall.endsWith("pr"));
	System.out.println("priya ends with PR?"+nameSmall.endsWith("PR"));
	System.out.println("String.tochar Arry is useful for programs like identify repeating char");
	char[] n=name.toCharArray();
	char[] nSmall=nameSmall.toCharArray();
	for(int i=0;i<n.length;i++)
	{
	System.out.println(n[i]);
		}
	System.out.println("-----");
	
	for(int i=0;i<nSmall.length;i++)
	{
		System.out.println(nSmall[i]);
	}
	System.out.println("-----");
	System.out.println("Starting index-"+name.charAt(0));
	System.out.println("End Index-"+name.charAt(4));
	
	System.out.println("-----");
	System.out.println("----Append");
	System.out.println(name.concat(" Bonam "));
	System.out.println("----Verify a String contains some Character");
	System.out.println(name.contains("p"));
	System.out.println(name.contains("P"));
		
	}
}
