package exceptionHandling;

public class CustomExceptionThrowAndThrowsEx {

	public static void main(String[] args) throws VotingException {
		int age=12;
		if(age>=18)
			System.out.println("Qualified");
		else
			throw new VotingException("Age should be greater than 18. Age is "+age);
	}

}
