package streder_p1;

public class Decrypter {

	// Needed the if statement to be able to see the variable
	//to store the result of every digit plus 10
	private int valOne;
	private int valTwo;
	private int valThree;
	private int valFour;

	void decrypt(Integer userInput)
	{
		String startingVal = Integer.toString(userInput);
		
		// Swap the elements back to original place 
		int elementOne = Character.getNumericValue(startingVal.charAt(2));	
		int elementTwo = Character.getNumericValue(startingVal.charAt(3));
		int elementThree = Character.getNumericValue(startingVal.charAt(0));
		int elementFour = Character.getNumericValue(startingVal.charAt(1));
		
		//Less than or equal to 6 because 9 + 7 = 16 and the remainder of 16 is 6
		if(elementOne <= 6)				
		{
			//Add 10 to the digit and then subtract 7 
			valOne = elementOne + 10;
			int resultOne = valOne - 7;
			System.out.print("Decrypted Number: " + resultOne);
		}
		else
		{
			//else just subtract 7 from the digit
			int resultOne = elementOne - 7;
			System.out.print("Decrypted Number: " + resultOne);
		}
		
		if (elementTwo <= 6)
		{
			//Add 10 to the digit and then subtract 7
			valTwo = elementTwo + 10;
			int resultTwo = valTwo - 7;
			System.out.print(resultTwo);
		}
		else 
		{
			//else just subtract 7 from the digit
			int resultTwo = elementTwo - 7;
			System.out.print(resultTwo);
		}
		
		if (elementThree <= 6)
		{
			//Add 10 to the digit and then subtract 7
			valThree = elementThree + 10;
			int resultThree = valThree - 7;
			System.out.print(resultThree);

		}
		else
		{
			//else just subtract 7 from the digit
			int resultThree = elementThree - 7;
			System.out.print(resultThree);
		}
		
		if (elementFour <= 6)
		{
			//Add 10 to the digit and then subtract 7
			valFour = elementFour + 10;
			int resultFour = valFour - 7;
			System.out.print(resultFour);

		}
		else
		{
			//else just subtract 7 from the digit
			int resultFour = elementFour - 7;
			System.out.print(resultFour);
		}
	}
}
