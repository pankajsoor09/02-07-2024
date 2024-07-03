package com.javaTypesOfMethods;

public class Example1 
{
// user defined method
	public static int sumOfNumbers(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args)
	{
		String text = "Welcome to Java Programing";
		
		System.out.println(text.length());
		
		System.out.println(sumOfNumbers(89, 34, 56));
		
		int sum = sumOfNumbers(890, 304, 506);
		
System.out.println(sum);

	}
	
}


