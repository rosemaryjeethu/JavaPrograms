package accessSpecifier;

public class PrivateAccessSpecifier {

	private void privateMethod1()
	{
		System.out.println("private method");
	}
	public static void main(String[] args) {
		PrivateAccessSpecifier pas=new PrivateAccessSpecifier();
		pas.privateMethod1();

	}

}
