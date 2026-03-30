package abstraction;

public abstract class AbstractClassExampleUsingInheritanceParent {

	public void parentMethod(int a, int b)
	{
		int c=a+b;
		System.out.println("Sum is: "+c);
	}
	public abstract void abstractMethod(); 
}
