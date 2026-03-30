package exceptionHandling;

public class ThrowKeywordExample {

	public static void main(String[] args) {
		
		int age=15;
		if(age>=18)
		{
			System.out.println("Qualified");
		}
		else
		{
			throw new ArithmeticException("Not qualified. Age is "+age);
		}
		System.out.println("Haiiii");
	}

}
