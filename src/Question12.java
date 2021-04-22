
import java.util.Scanner;

public class Question12{

	public Question12(boolean run){ if(run) answer(); }

	private void answer(){

		final Scanner keyboard = new Scanner(System.in);
		System.out.print("Favourite City => ");
		final String CITY_NAME = keyboard.nextLine();

		System.out.println("Length => " + CITY_NAME.length());
		System.out.println("Uppercase => " + CITY_NAME.toUpperCase());
		System.out.println("Lowercase => " + CITY_NAME.toLowerCase());
		System.out.println("First Char => " + CITY_NAME.charAt(0));

	}

}