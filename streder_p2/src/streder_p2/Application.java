package streder_p2;

public class Application {

	public static void main(String[] args) {
		
		BMICalculator app = new BMICalculator();
		String userMethod = app.methodType();
		Float[] userInput = app.readUserData(userMethod);
		Float bmi = app.calculateBmi(userInput, userMethod);
		app.displayBmi(bmi);
	}
}
