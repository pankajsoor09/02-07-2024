package com.javaMethods;

public class Example4 
{
	/**
	 * Write a java program to calculate the Area of circle.
	 */
	//main main()
	public static void main(String[] args) 
	{
		//activity-1: print hello statement on the screen
        System.out.println("Hello");
        
        System.out.println();
        
		//activity-2: print name.
        String name = "Pankaj Soor";//variable definition
		
		System.out.println(name);//print statement

		System.out.println();

		//activity-3: calculate Area of circle

		float radius =3.5f;
		double area = 0.0;
		
		final double AREA_OF_CIRCLE_PI_VALUE = Math.PI;
		area = AREA_OF_CIRCLE_PI_VALUE*radius*radius;
		
		System.out.println(area);//print statement
	}

}
