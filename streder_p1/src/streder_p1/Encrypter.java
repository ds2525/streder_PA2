package streder_p1;

public class Encrypter {

	void encrypt(Integer userInput)
	{
		//Converting integer into a string to be able to access every digit 																	
		String startingVal = Integer.toString(userInput);													
		int elementOne = startingVal.charAt(0);						
		int elementTwo = startingVal.charAt(1);
		int elementThree = startingVal.charAt(2);
		int elementFour = startingVal.charAt(3);
		
		// Adding 7 to every digit in the integer
		int valOne = Character.getNumericValue(elementOne) + 7;
		int valTwo = Character.getNumericValue(elementTwo) + 7;
		int valThree = Character.getNumericValue(elementThree) + 7;
		int valFour = Character.getNumericValue(elementFour) + 7;
		
		// Getting to remainder of every digit
		int resultOne = valThree % 10;
		int resultTwo = valFour % 10;
		int resultThree = valOne % 10;
		int resultFour = valTwo % 10;
		
		// Converting the integer back to a string so it displays the 0
		String finalStrResult = Integer.toString(resultOne) + Integer.toString(resultTwo) 
								+ Integer.toString(resultThree) + Integer.toString(resultFour) + "\n";
		
		System.out.print("Encrypted Number: " + finalStrResult);
	}
}
