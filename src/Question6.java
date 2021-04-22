
public class Question6{

	public Question6(boolean run){ if(run) answer(); }

	private void answer(){

		final float PERCENTAGE = 0.65f;
		final float SALES = 8.3E6f;
		final float EAST_COST_SALES = SALES * PERCENTAGE;
		System.out.printf("The East Coast Generated $%.2f in sales", EAST_COST_SALES);

	}
}