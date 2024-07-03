package com.javaMethods;

public class Example5 
{
		//printStatement() method: activity-1
		public static void printStatement()
		{
			//activity-1: print hello statement on the screen
			System.out.println("Hello");
		}

		//printName() method: activity-2
		public static void printName()
		{
			//activity-2: print name.
			String name = "Dinesh Kumar";//variable definition	
			System.out.println(name);//print statement
		}

		//calculateAreaOfCircle() method: activity-3
		public static void calculateAreaOfCircle()
		{
			//activity-3: calculate Area of circle

			float radius = 3.5f;

			double area = 0.0;

			final double AREA_OF_CIRCLE_PI_VALUE = Math.PI;

			area = AREA_OF_CIRCLE_PI_VALUE*radius*radius;

			System.out.println(area);//print statement
		}

		public static void main(String[] args)
		{	

			calculateAreaOfCircle();
			
		
	}

}
