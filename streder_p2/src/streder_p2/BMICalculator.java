package streder_p2;

import java.util.Scanner;

public class BMICalculator {
	
	String pounds = "pounds";
	String kilograms = "kilograms";
	
	public Float[] readUserData(String method)
	{	
		Scanner userInput = new Scanner(System.in);
		
		Float[] readUserInput;
		readUserInput = new Float[2];
		
		
		if (method.equals(pounds))
		{
			for(int i = 0; i < readUserInput.length;)
			{
				System.out.println("Enter Weight in pounds: ");
				readUserInput[i] = userInput.nextFloat();
			
				i++;
				
				System.out.println("Enter Height in inchs: ");
				readUserInput[i] = userInput.nextFloat();
				
				i++;
			}
			
			return readUserInput;
		}
		else if(method.equals(kilograms))
		{
			for(int i = 0; i < readUserInput.length;)
			{
				System.out.println("Enter Weight in kilograms: ");
				readUserInput[i] = userInput.nextFloat();
				
				i++;
			
				System.out.println("Enter Height in meters: ");
				readUserInput[i] = userInput.nextFloat();
				
				i++;
			}
		
			return readUserInput;
		}
		else
		{
			System.out.println("Error with the input, try entering pounds or kilograms");
			return readUserInput;
		}
	}
	
	Float calculateBmi(Float[] userInput, String readUserMethod) 
	{
		if(readUserMethod.equals(pounds))
		{
			Float weight = 703 * userInput[0];
			Float height = userInput[1] * userInput[1];
			Float result = weight / height;
			return(result);
		}
		else
		{
			Float weight = 703 * userInput[0];
			Float height = userInput[1] * userInput[1];
			Float result = weight / height;
			return(result);
		}
	}
	
	void displayBmi(Float bmi) 
	{
		if(bmi <= 18.5)
		{
			System.out.printf("%f\n", bmi);
			System.out.println("Underweight");
		}
		else if(bmi > 18.5 && bmi <= 24.9)
		{
			System.out.printf("%f\n", bmi);
			System.out.println("Normal Weight");
		}
		else if(bmi > 25 && bmi <= 29.9)
		{
			System.out.printf("%f\n", bmi);
			System.out.println("Overweight");
		}
		else
		{
			System.out.printf("%f\n", bmi);
			System.out.println("Obesity");
		}
	}
	
	public String methodType()
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter pounds or kilograms: ");
		String readUserMethod = userInput.next();
		
		return readUserMethod;
	}

}
