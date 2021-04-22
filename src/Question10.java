
import java.util.Scanner;

public class Question10{

	public Question10(boolean run){ if( run ) answer(); }

	private void answer(){

		final Scanner keyboard = new Scanner(System.in);

		double accumulator = 0;
		for( int itr=0; itr<3; itr++ ){
			System.out.printf("Score %d => ", itr+1);
			accumulator += keyboard.nextInt();
		}
		double average = (double)accumulator / 3;
		System.out.printf("Average Score => %.2f", average);

	}

}