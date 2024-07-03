package com.javaMethods;

public class Example6
{
	//Void methods cannot return a value
		public static int findStringCharsCount(String text)
		{
			//System.out.println(text);
			return text.length();
		}
		
		//Void methods cannot return a value
		public static String printMessage(String text)
		{
			return text;//return statement
		}
	/**
	 *  access-modifier non-access modifier method-return-type method-name(parameters)
	 *  {
	 *  
	 *  
	 *  
	 *  }
	 *  
	 *  access-modifiers: private, default(No Keyword), protected and public
	 *  ================
	 *  
	 *  non access-modifiers: static, final, abstract, synchronized...etc
	 *  ====================
	 *  
	 *  return type: all data types(byte, short, int, long, float, double, char, boolean,
	 *  ============ array, void and all classes(predefined and user defined))
	 *    
	 *  method-name: name of the method
	 *  ===========
	 *  
	 *  Parameters: these are local variables of method/constructor
	 *  
	 *  Arguments: when we are calling any parameterized method by supplying values/literals
	 *             to the parameters
	 *  
	 *  Note: when method return type is void, then we no need to take return statement
	 *        in method body.
	 */
		
		public static void printNameOfPerson()
		{
			String name = "Dinesh Kumar";	
			System.out.println(name);
		}

		
		public static void main(String[] args) 
		{	
			System.out.println(findStringCharsCount("Hello"));
	}

}
