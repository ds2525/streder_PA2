package streder_p1;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter 4 digit number: ");
		 Integer readUserInput = userInput.nextInt();
		 Encrypter encrypter = new Encrypter();
		 Decrypter decrypter = new Decrypter();
		 encrypter.encrypt(readUserInput);
		 decrypter.decrypt(readUserInput);
		 userInput.close();
	}
}
