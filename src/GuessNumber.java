import java.util.*;
public class GuessNumber extends Games{

	@Override
	public void greeting() {
		System.out.println("Welcome "+super.getName()+" to Guess a Number!");
	}
	
	public GuessNumber(String name) {
		setName(name);
	}
	
	public void takeGuess() {
		int num = (int)(Math.random()*10)+1;
		try {
			System.out.println("I've chosen a number between 1 and 10. Guess what it is by entering your guess to the console now.");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			while(input != num) {
				System.out.println("Try again!");
				input = sc.nextInt();
			}	
			System.out.println("Congrats! You've just won a gazillion Schrute Bucks!");
			sc.close();
		} catch(InputMismatchException ime) {
			System.out.println("Oops! You crashed the game! Restart the program and be sure to only input whole numbers when playting Guess a Number.");
		}
	}
}
