package exceptionHandling;

public class VotingException extends Exception {

	public VotingException(String vote) {
		super(vote);
	}

}
