package com.javaTypesOfMethods;

public class Example2 {

	//user defined method
		public static int sumOfNumbers1(int b, int c)
		{
			return b+c; 
		}
		
		public static int sumOfNumbers2(int a, int b, int c)
		{
			return a+b+c; 
		}

		public static void main(String[] args) {


			System.out.println(sumOfNumbers1(34, 56));

			Example2 e2 = new Example2();
			
			int sum = e2.sumOfNumbers2(890, 304, 506);

			System.out.println(sum);		
		}
}
