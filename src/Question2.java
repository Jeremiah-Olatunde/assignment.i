
public class Question2{

	public Question2(boolean run){ if(run) answer(); }

	private void answer(){

		String firstName = "Jesuseun";
		String middleName = "Jeremiah";
		String lastName = "Olatunde";

		char firstInitial = firstName.charAt(0);
		char middleInitial = middleName.charAt(0);
		char lasttInitial = lastName.charAt(0);

		System.out.printf(
			"Names => %s %s %s \nInitials => %s.%s.%s",
			firstName, middleName, lastName,
			firstInitial, middleInitial, lasttInitial
		);

	}
}