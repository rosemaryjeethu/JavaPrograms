package accessSpecifier;

public class ProtectedAccessSpecifierExmple {

	protected void protectedMethod()
	{
		System.out.println("This is a protected method");
	}
	public static void main(String[] args) {
		ProtectedAccessSpecifierExmple pase=new ProtectedAccessSpecifierExmple();
		pase.protectedMethod();
	}

}
