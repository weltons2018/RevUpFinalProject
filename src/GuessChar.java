import java.util.*;
public class GuessChar extends Games {

	@Override
	public void greeting() {
		System.out.println("Welcome "+getName()+" to Guess a letter!");
	}

	public GuessChar(String name) {
		setName(name);
	}
	
	public void takeGuess() {
		ArrayList<Character> charlist = new ArrayList<Character>();
		charlist.add('a');
		charlist.add('b');
		charlist.add('c');
		charlist.add('d');
		charlist.add('e');
		charlist.add('f');
		charlist.add('g');
		charlist.add('h');
		charlist.add('i');
		charlist.add('j');
		charlist.add('k');
		charlist.add('l');
		charlist.add('m');
		charlist.add('n');
		charlist.add('o');
		charlist.add('p');
		charlist.add('q');
		charlist.add('r');
		charlist.add('s');
		charlist.add('t');
		charlist.add('u');
		charlist.add('v');
		charlist.add('w');
		charlist.add('x');
		charlist.add('y');
		charlist.add('z');
		for(char c: charlist) {
			System.out.print(c+", ");
		}
		System.out.println("Guess a letter! Enter your guess to the console.");
		char a = charlist.get((int)(Math.random()*26)+1);
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		while(input != a) {
			System.out.println("Try again!");
			input = sc.next().charAt(0);
		}
		System.out.println("Congrats! You've just won a bazillion doll hairs!");
		sc.close();
	}
}
