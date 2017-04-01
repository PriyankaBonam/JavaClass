package com.test.demo;

class  E{
	
	E f= new E();
	D d=new D();
    void add()
    {
    	E return1=d.fun(f);
    }
    E test()
    {
    	return new E();
    	
    }
	
}

class D
{
	public E fun(E f)
	{
		System.out.println("Inside Class D ");
		return f;
	}
}

public class functionObject
{
	public static void main(String[] args) {
		
	}
}