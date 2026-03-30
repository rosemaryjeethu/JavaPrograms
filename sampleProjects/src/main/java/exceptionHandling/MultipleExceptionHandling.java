package exceptionHandling;

public class MultipleExceptionHandling {

	public static void main(String[] args) {
		
		try {
		
			int[] arr=new int[3];
			arr[3]=22/0;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Exception 2 is :"+e);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Exception 1 is :"+e);
		}
		System.out.println("Hai");
	}

}
