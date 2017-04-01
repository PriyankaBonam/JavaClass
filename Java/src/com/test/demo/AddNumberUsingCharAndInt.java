package com.test.demo;

public class AddNumberUsingCharAndInt {

	public static void main(String[] args) {
		// We can only do Increment on Integer using CHar
		//cant add
		int i=1;
		char c='1';
		System.out.println("Increment using int : "+(++i));
		System.out.println("Increment using Char"+(++c));
		System.out.println("---------");
		System.out.println("Addition using int"+(i+10));
		System.out.println("Addition using Char"+(c+10));
		
				
	}
}
