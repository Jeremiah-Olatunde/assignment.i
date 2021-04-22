
import java.util.Scanner;

public class Question5{

	public Question5(boolean run){ if(run) answer(); }

	private void answer(){

		final Scanner keyboard = new Scanner(System.in);

		final byte TOTAL_COOKIE_NO = 40;
		final byte SERVING_NO = 10;
		final short CAL_PER_SERVING = 300;

		System.out.print("Number of cookies consumed => ");

		final int CONSUMED = keyboard.nextInt();
		final int CAL_CONSUMED = 300 / ( TOTAL_COOKIE_NO / SERVING_NO ) * CONSUMED;

		System.out.printf("You have consumed %d calories", CAL_CONSUMED);		

	}
}