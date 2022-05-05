import java.util.*;
public class MadLib extends Games {

	@Override
	public void greeting() {
		System.out.println("Welcome "+super.getName()+" to MadLib!");
	}

	public MadLib(String name) {
		setName(name);
	}
	
	public void playMadLib() {
		System.out.println("If you're unfamiliar with what a MadLib is, get ready to have some fun! Start by entering three nouns, three adjectives, and three present-tense"
				+ "verbs to the console. Then, watch the story unfold!");
		Scanner sc = new Scanner(System.in);
		String noun1 = sc.next();
		String noun2 = sc.next();
		String noun3 = sc.next();
		String adj1 = sc.next();
		String adj2 = sc.next();
		String adj3 = sc.next();
		String verb1 = sc.next();
		String verb2 = sc.next();
		String verb3 = sc.next();
		System.out.println("The "+adj1+" "+noun1+"s "+verb1+"ed into town one day. \"We're doomed!\" the "+adj2+" "+noun2+"s cried. The "+noun1+"s then began to "+verb2+", "
				+ "causing the earth itself to tremble. \"Will no one help us?!\" the "+noun2+"s cried. Just then, the "+adj3+" "+noun3+" "+verb3+"ed into the edge of the town."
						+ " \"We're saved!\" the "+noun2+"s cried. The "+noun1+"s fled before the "+adj3+" "+noun3+", vowing to return one day...");
		sc.close();
	}
}
