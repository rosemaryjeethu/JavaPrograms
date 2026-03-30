package abstraction;

public class AbstractClassExampleUsingInheritanceChild extends AbstractClassExampleUsingInheritanceParent{
	
	public void childMethod() {
		System.out.println("Child method");
	}
	
	public static void main(String[] args) {
		
		AbstractClassExampleUsingInheritanceChild obj=new AbstractClassExampleUsingInheritanceChild();
		obj.childMethod();
		obj.parentMethod(5, 10);
		obj.abstractMethod();
	}

	@Override
	public void abstractMethod() {
		
		System.out.println("This is an abstract method");
		
	}
	
	
}
