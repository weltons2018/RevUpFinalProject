import java.util.*;
public abstract class Games {

	private String name;
	
	public abstract void greeting();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Grant's Games! The available games are Madlib, GuessNumber, and GuessCharacter. Enter your selection to the console, then enter your "
				+ "name to the console to begin.\nRestart the program to pick a different game.");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String inputName = scanner.next();
		switch(input) {
			case "Madlib":
				MadLib madlib = new MadLib(inputName);
				madlib.greeting();
				madlib.playMadLib();
				break;
			case "GuessNumber":
				GuessNumber guessnum = new GuessNumber(inputName);
				guessnum.greeting();
				guessnum.takeGuess();
				break;
			case "GuessCharacter":
				GuessChar guessChar = new GuessChar(inputName);
				guessChar.greeting();
				guessChar.takeGuess();
				break;
			default:
				System.out.println("Oops! Looks like you input your selection improperly. Restart the program and try again.");
		}
		scanner.close();
	}
}
