package exceptionHandling;

public class TryCatchExample {

	public static void main(String[] args) {
		try {
		int c=0,a=10;
		c=a/0;
		System.out.println("value of c:"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception catched is "+e);
		}
		finally {
			System.out.println("Inside final block");
		}
		System.out.println("Hai");
	}

}
