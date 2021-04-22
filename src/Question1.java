
public class Question1{

	public Question1(boolean run){ if(run) answer(); }

	private void answer(){

		String name = "Jesuseun Jeremiah Olatunde";
		int age = 19;
		double annualPay = 1E12;
		System.out.printf(
			"My name is %s, my age is %d, I hope to earn $%.1f per year \n", 
			name, age, annualPay
		);

	}
}